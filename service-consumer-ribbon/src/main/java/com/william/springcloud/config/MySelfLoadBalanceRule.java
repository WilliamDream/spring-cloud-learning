package com.william.springcloud.config;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * 自定义负载均衡策略
 * 使用轮询，每个服务请求五次则调用下一个服务，如此循环
 *
 */
public class MySelfLoadBalanceRule extends AbstractLoadBalancerRule{
	
	private int total = 0;
	private int currentIndex = 0;
	

	public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            //获取可用的服务
            List<Server> upList = lb.getReachableServers();
            //获取所有服务
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }
            
            if(total<5) {
            	total++;
            }else {
            	total = 0;
            	currentIndex = currentIndex % upList.size();
            }
            server = upList.get(currentIndex);

            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;
	}

	 
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	public void initWithNiwsConfig(IClientConfig arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}

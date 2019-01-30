package com.william.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;

@Configuration
public class ConfigBean {

	
	@Bean
	@LoadBalanced    
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * Ribbon是客户端负载均衡，默认轮询算法RoundRobinRule
	 * 
	 */
	@Bean
	public RoundRobinRule roundRule() {
		return new RoundRobinRule();
	}
	
	/**
	 * 随机
	 * 
	 */
//	@Bean	
	public RandomRule randomRule() {
		return new RandomRule();
	}
	
	/**
	 * 响应时间作为选取权重的负载均衡策略。根据平均相应时间计算所有服务的权重
	 * 响应时间越短的服务权重越大被选中的可能性大。刚启动如果统计信息不足，则
	 * 使用RoundRobinRule策略，等统计信息足够，则切换到WeightedResponseTimeRule策略。
	 * 
	 */
//	@Bean	
	public WeightedResponseTimeRule weightedRule() {
		return new WeightedResponseTimeRule();
	}
	
	/**
	 * 会过滤掉由于多次访问故障而处于断路跳闸的服务，还有并发连接数量超过阈值的服务，
	 * 然后对剩余的服务按照轮询的方式访问
	 * 
	 */
//	@Bean	
	public AvailabilityFilteringRule availRule() {
		return new AvailabilityFilteringRule();
	}
	
	/**
	 * 先按照RoundRobinRule策略获取服务，在获取服务失败则最大重试时间的限定下重复尝试选取服务
	 * 直到超时或者获取下一个服务
	 */
//	@Bean	
	public RetryRule retryRule() {
		return new RetryRule();
	}
	
	/**
	 * 从那些没有断开的服务中，找到请求量最小的服务。
	 * 
	 */
//	@Bean
	public BestAvailableRule clientConfigRule() {
		return new BestAvailableRule();
	}
	
	/**
	 * 复合判断Server所在区域的性能和可用性
	 * 
	 */
//	@Bean
	public ZoneAvoidanceRule zoneAvoidanceRule() {
		return new ZoneAvoidanceRule();
	}
	
	
}

### ZUUL网关

####1. zuul相当于过滤器，是微服务的入口

启动以下服务：

- Eureka服务注册中心，`eureka-server`、`eureka-server`、`eureka-server`；

- 和服务提供者`service-provider-01`；

- ZUUL网关服务`service-zuul-gateway`。

  接着访问如下地址：

[地址1]: http://localhost:8010/user
[地址2]: http://myzuul.com/9527/userinfo-service/user

可以发现两个地址都可以正常访问到接口。

`http://myzuul.com/9527/userinfo-service/user `：域名+端口+微服务名+接口地址

#### 2. 修改配置

在application.yml中添加配置：

```yaml
# 该段配置可以查看ZuulProperties类
zuul:
  # url统一添加前缀
  prefix: /springcloud
  # 忽略掉微服务名，采用别名访问
  # 如果想忽略掉所有 ignoredServices: "*"
  ignoredServices: userinfo-service
  routes:
    # 服务名称
    userservice.serviceid: userinfo-service
    # 服务别名
    userservice.path: /userapp/**
```
[由上面配置得到访问路径变为]: http://myzuul.com:9060/springcloud/userapp/user


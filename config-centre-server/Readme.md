#### 服务配置管理 config

##### github上添加配置文件

首先在spring-cloud-learning下创建一个文件夹**config-repository**，然后将用户服务的配置文件**application-dev.properties**上传到该目录下。

##### 配置中心服务端config-centre-server

引入依赖：

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
```

在服务端主程序类上加上**@EnableConfigServer** 

`application.yml`配置如下：

```
server:
  port: 10010

spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/WilliamDream/spring-cloud-learning.git
          username: williamdream
          password: cz512831
          #仓库路径下的的相对搜索位置，注意在git上需要存在该目录
          search-paths: config-repository
      # 配置git仓库的分支
      label: master


eureka:
#  instance:
#    instance-id: UserInfo-Service   #服务名#
#    prefer-ip-address: true  # 访问路径可以显示ip
  client:
    healthcheck:
      enabled: true
    service-url:
      defaultZone: http://eureka7001:7001/eureka/,http://eureka7002:7002/eureka/
```

##### 测试

访问http://localhost:10010/application-dev.properties





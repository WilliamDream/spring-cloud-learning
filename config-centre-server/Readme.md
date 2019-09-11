#### 服务配置管理 config

##### github上添加配置文件

首先在spring-cloud-learning下创建一个文件夹**config-repository**，然后将用户服务的配置文件**config-client-dev.properties**上传到该目录下。

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

```yaml
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

http请求
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

访问http://localhost:10010/config-client-dev.properties

##### 创建config-centre-client工程

添加依赖
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-client</artifactId>
    <version>2.0.2.RELEASE</version>
</dependency>
```
添加配置bootstrap.yml，注意是bootstrap.yml，不是application.yml。
```yaml
spring:
  application:
    # 此名字要与配置中心文件xxx-profile.yaml 一致
    name: config-client
  cloud:
    config:
      label: master
      profile: test
      uri: http://localhost:10010/
#      discovery:
#        enabled: true
#        service-id: config-server
```

新增一个/config/getport接口






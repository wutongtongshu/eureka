- parent全部maven模块的父模块，负责管理全部微服务

- center 模块是服务注册中心，已经在application.yaml中配置做了两套配置，必要时可以启动两个实例

- service服务提供者，提供服务

- consummer微服务的使用者

  - 引入 spring-cloud-starter-ribbon做客户端负载均衡
  - 引入spring-cloud-starter-hystrix做熔断处理

- configcenter集中配置文件存放目录

- feign这个是API层的一套实现方案

- Dashboard 是hystrix的仪表盘，主要用来实时监控Hystrix的各项指标信息，通过界面反馈的信息可以快速发现系统中存在的问题 

- api-gateway这是使用了zuul转发的API层实现

- config-client这个是以github为配置中心的客户端

- config-server这个是以github为配置中心的服务端

  
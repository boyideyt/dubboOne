# Dubbo分布式服务调度
## 1.场景概述

- 商品库存服务发布**商品列表服务**，注册至注册中心
- 商城平台服务订阅**商品列表服务**

## 2.使用步骤

1. 启动zookeeper
2. 启动dubboOne
3. 启动dubboTwo（确认dubboTwo引用了dubboOne的api包，没引用需要在dubboOne install）
4. 访问http://127.0.0.1:8094/dubboTwo/item/page/list?pageNo=1&pageSize=5

##3.技术选型： 
   
   - 核心框架：Spring Boot 2.0.5
   - 服务框架：Dubbo 2.6.4、Zookeeper 3.4.14
   - 持久层框架：MyBatis 3.5
   - 数据库：Mysql 8
   - 数据库连接池：Druid 1.1
   - 日志管理：SLF4J 1.7、Log4j 1.2.17
   - api工具：PageHelper 4.1.2、Lombok 1.16.10
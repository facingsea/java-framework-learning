# dubbo-test
dubbo测试
## api
为接口定义
## provider
为服务提供者
## consumer
为服务消费者
## dubbo-admin
用于管理dubbo应用，使用dubbo源码编译，为war包。
百度网盘链接: http://pan.baidu.com/s/1eSv5L42 密码: jqhu
放到tomcat的webapp目录下，启动tomcat即可，登录用户名和密码在：dubbo-admin-2.5.4-SNAPSHOT\WEB-INF\dubbo.propertiest文件中：
```
dubbo.registry.address=zookeeper://127.0.0.1:2181
dubbo.admin.root.password=root
dubbo.admin.guest.password=guest
```
即：root用户密码为root，guest用户密码为guest

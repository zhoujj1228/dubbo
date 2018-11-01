1.安装zookeeper
下载并安装zookeeper
复制并修改zoo_sample.cfg为zoo.cfg
bin目录启动zookeeper

2.配置服务端
编辑服务接口
实现服务接口并添加service注解
编辑配置
--server端口
--应用名
--协议名
--协议端口
--zookeeper地址
--dubbo加载目录

3.配置客户端
复制添加服务接口（目录也需要一致）
编辑调用类，声明服务接口处添加Reference注解
编辑配置
--server端口
--应用名
--zookeeper地址
--dubbo加载目录


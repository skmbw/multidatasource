1、将项目导入到Eclipse中

2、新建两个数据库，ds1和ds2
2-1、 将sql文件夹中的user.sql导入到ds1中；
2-2、将sql文件夹中的member.sql导入到ds2中；

3、修改src下的config.properties文件中的jdbc连接
3-1、
jdbc.ds1.username=root
jdbc.ds1.password=3416763
 改为自己ds1数据库的账号和密码。
 
jdbc.ds1.url=jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=ds1
根据实际情况调整jdbc.ds1.url

 3-2、
jdbc.ds2.username=root
jdbc.ds2.password=3416763
改为自己ds2库的账号和密码

jdbc.ds2.url=jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=ds2
根据实际情况调整jdbc.ds2.url

4、修改hibernate的方言
hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
改为sqlserver的，根据自己的sqlserver版本进行选择其一：
hibernate.dialect=org.hibernate.dialect.SQLServer2005Dialect
hibernate.dialect=org.hibernate.dialect.SQLServer2008Dialect
hibernate.dialect=org.hibernate.dialect.SQLServer2012Dialect

5、然后配置tomcat、jdk等，启动tomcat

6、访问localhost:8080/multidatasource/user/save，通过控制台日志，可以看到数据已经
成功插入到数据库中。
访问localhost:8080/multidatasource/member/save也可

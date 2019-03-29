### SpringBoot Demo测试
### 功能
1.  查找全部

http://localhost:8080/api/user/findAll

2. 新增用户

http://localhost:8080/api/user/addUse
```
Content-Type= application/x-www-form-urlencoded

body: 
id:23
name:sdfsdf
age:23423
```

### 文档
https://blog.csdn.net/u011961421/article/details/79413897
```
REST：英文representational state transfer直译为表现层状态转移，或者表述性状态转移；Rest是web服务的一种架构风格，一种设计风格，是一种思想；同时Rest不是针对某一种编程语言的。 
以webService为例通俗解释。 
非Rest设计，以往我们都会这么写： 
http://localhost:8080/admin/getUser （查询用户） 
http://localhost:8080/admin/addUser （新增用户） 
http://localhost:8080/admin/updateUser （更新用户） 
http://localhost:8080/admin/deleteUser （删除用户） 
总结：以不同的URL（主要为使用动词）进行不同的操作。

Rest架构： 
GET http://localhost:8080/admin/user （查询用户） 
POST http://localhost:8080/admin/user （新增用户） 
PUT http://localhost:8080/admin/user （更新用户） 
DELETE http://localhost:8080/admin/user （删除用户） 
总结：URL只指定资源，以HTTP方法动词进行不同的操作。用HTTP STATUS/CODE定义操作结果。

Restful：遵守了rest风格的web服务便可称为Restful。
----------------
```





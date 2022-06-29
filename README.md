# WindyIsland API

## 前端端口：8080

| 路径                  | 页面                 |
| --------------------- | -------------------- |
| /                     | 根页面(重定向到主页) |
| /{deviceType}/home    | 主页页面             |
| /{deviceType}/program | 编程页面             |
| /{deviceType}/book    | 书籍页面             |
| /{deviceType}/daily   | 日常页面             |
| /{deviceType}/message | 评论页面             |
| /{deviceType}/saysay  | 说说页面             |
| /{deviceType}/link    | 友链页面             |
| /{deviceType}/user    | 用户页面             |

·、

## 后端端口：8081

| 接口类型 | 访问路径         | 接口功能 | 参数名称  | 参数类型     | 参数说明 |
| -------- | ---------------- | -------- | --------- | ------------ | -------- |
| get      | /user/findAll    | 查询用户 |           |              |          |
| post     | /user/add        | 添加用户 | username  | varchar(16)  | 用户名   |
|          |                  |          | password  | varchar(32)  | 密码     |
|          |                  |          | useremail | varchar(64)  | 邮箱     |
| get      | /comment/findAll | 查询评论 |           |              |          |
| post     | /comment/add     | 添加评论 | message   | varchar(255) | 留言内容 |
|          |                  |          | uid       | Long         | 留言人ID |
| get      | /saysay/findAll  | 查询说说 |           |              |          |
| post     | /saysay/add      | 添加说说 | message   | varchar(255) | 说说内容 |


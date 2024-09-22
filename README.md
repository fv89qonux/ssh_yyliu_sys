## 本项目实现的最终作用是基于SSH在校英语教学交流网站
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 在线阅读管理
 - 帖子信息管理
 - 测试题目管理
 - 用户注册管理
 - 管理员登陆
 - 考试试题添加
 - 论坛板块管理
 - 资源共享管理
### 第2个角色为用户角色，实现了如下功能：
 - 在线答题
 - 在线阅读区
 - 用户注册
 - 用户登陆
 - 试题下载
 - 资源共享下载
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_yyliu_sys

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [t_admin](#t_admin) | 管理员表 |
| [t_catelog](#t_catelog) |  |
| [t_huifu](#t_huifu) |  |
| [t_shiti](#t_shiti) |  |
| [t_timu](#t_timu) |  |
| [t_user](#t_user) | 用户表 |
| [t_yuedu1](#t_yuedu1) |  |
| [t_zhuti](#t_zhuti) |  |
| [t_ziyuan](#t_ziyuan) |  |

**表名：** <a id="t_admin">t_admin</a>

**说明：** 管理员表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | UserId |   int   | 10 |   0    |    N     |  Y   |       | 用户ID  |
|  2   | userName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 用户名  |
|  3   | userPw |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 密码  |

**表名：** <a id="t_catelog">t_catelog</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | name |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 名字  |
|  3   | jieshao |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 介绍  |
|  4   | banzhu |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  5   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_huifu">t_huifu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |   0    |   |
|  2   | title |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    |   |
|  3   | content |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  4   | shijian |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 时间  |
|  5   | user_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 用户ID  |
|  6   | zhuti_id |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_shiti">t_shiti</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | leixing |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | mingcheng |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名称  |
|  4   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  5   | fujianYuanshiming |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件原名  |
|  6   | shijian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 时间  |
|  7   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_timu">t_timu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | name |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | 名字  |
|  3   | xuanxianga |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | A选项  |
|  4   | xuanxiangb |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | B选项  |
|  5   | xuanxiangc |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | C选项  |
|  6   | xuanxiangd |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | D选项  |
|  7   | daan |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | 答案  |
|  8   | fenshu |   int   | 10 |   0    |    Y     |  N   |   NULL    | 分数  |
|  9   | del |   varchar   | 2000 |   0    |    Y     |  N   |   NULL    | 是否删除  |

**表名：** <a id="t_user">t_user</a>

**说明：** 用户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  N   |       | ID  |
|  2   | loginname |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 登录名称  |
|  3   | loginpw |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 登录密码  |
|  4   | name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名字  |
|  5   | sex |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 性别  |
|  6   | age |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 年龄  |
|  7   | address |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 地址  |
|  8   | tel |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 电话  |
|  9   | email |   varchar   | 45 |   0    |    Y     |  N   |   NULL    | 邮箱  |
|  10   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  11   | jifen |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  12   | del |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_yuedu1">t_yuedu1</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | biaoti |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 标题  |
|  3   | neirong |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  4   | shijian |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 时间  |

**表名：** <a id="t_zhuti">t_zhuti</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | title |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    |   |
|  3   | content |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  4   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  5   | fujianYuanshiming |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 附件原名  |
|  6   | shijian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 时间  |
|  7   | user_id |   int   | 10 |   0    |    Y     |  N   |   NULL    | 用户ID  |
|  8   | catelog_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  9   | shifouding |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  10   | shifoujing |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="t_ziyuan">t_ziyuan</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | biaoti |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 标题  |
|  3   | neirong |   varchar   | 5000 |   0    |    Y     |  N   |   NULL    | 内容  |
|  4   | fujian |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 附件  |
|  5   | shijian |   varchar   | 60 |   0    |    Y     |  N   |   NULL    | 时间  |


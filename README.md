# 学生考勤管理系统

## 个人信息

| 项目 | 内容         |
|------|------------|
| **姓名** | 许洋         |
| **学号** | 42411083   |
| **班级** | 计算机科学与技术2班 |
| **专业** | 计算机科学与技术   |
| **学院** | 计算机科学与技术学院 |

## 项目简介
这是一个基于 Spring Boot 的学生考勤管理系统，实现了学生信息管理、考勤打卡、课程查询等功能。

## 技术栈
- **后端框架**: Spring Boot
- **数据库访问**: JdbcTemplate
- **数据库**: MySQL
- **构建工具**: Maven

## 项目结构
src/main/java/com/example/attendancesystem/
├── controller/ # 控制层
│ └── StudentController.java
├── service/ # 业务层
│ ├── StudentService.java
│ └── impl/
│ └── StudentServiceImpl.java
├── dao/ # 数据访问层
│ └── StudentDao.java
└── entity/ # 实体类
└── Student.java
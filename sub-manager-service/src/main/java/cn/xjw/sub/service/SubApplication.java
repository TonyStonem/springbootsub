package cn.xjw.sub.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 2020/1/8 10:20
 *
 * @author <a href="1521975316@qq.com">xjw</a>
 * @record:
 *
 * @ComponentScan：组件扫描路径，包含@Servier、@Controller、@Component
 * @MapperScan：指定Mapper基础包的路径
 * @EnableAsync：异步任务，see also: https://www.jianshu.com/p/a4b4f3df4992
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.xjw.sub"})
@MapperScan(basePackages = {"cn.xjw.sub.base.dao"})
@EnableTransactionManagement
public class SubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubApplication.class, args);
    }

}

/**
 先修改数据库配置，并建表，建表语法：
 CREATE DATABASE spring_study_db;

 USE spring_study_db;

 CREATE TABLE T_USER (
 user_id VARCHAR (32) PRIMARY KEY,
 sex VARCHAR (2) NOT NULL,
 `status` VARCHAR (4) NOT NULL,
 user_name VARCHAR (32) NOT NULL,
 create_time DATETIME (3) NOT NULL,
 update_time DATETIME (3)
 );

 INSERT INTO T_USER(user_id, sex, `status`, user_name, create_time)
 VALUES('xiaotian', '男', '1001', '小天', NOW());

 建表后再启动，启动后打开：http://localhost:7001/swagger-ui.html
 就可以看到接口了，接口使用的是Swagger，关于Swagger：https://blog.csdn.net/qq_20698983/article/details/83830284
 */
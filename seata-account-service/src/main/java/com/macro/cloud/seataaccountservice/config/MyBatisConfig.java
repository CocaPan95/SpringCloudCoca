package com.macro.cloud.seataaccountservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.macro.cloud.seataaccountservice.dao"})
public class MyBatisConfig {
}

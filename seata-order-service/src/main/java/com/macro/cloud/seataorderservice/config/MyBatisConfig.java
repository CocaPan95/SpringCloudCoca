package com.macro.cloud.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.macro.cloud.seataorderservice.dao"})
public class MyBatisConfig {
}

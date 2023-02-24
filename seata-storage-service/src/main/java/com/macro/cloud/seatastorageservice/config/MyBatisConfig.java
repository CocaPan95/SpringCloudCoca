package com.macro.cloud.seatastorageservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.macro.cloud.seatastorageservice.dao"})
public class MyBatisConfig {
}

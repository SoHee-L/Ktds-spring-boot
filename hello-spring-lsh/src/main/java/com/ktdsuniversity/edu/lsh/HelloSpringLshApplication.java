package com.ktdsuniversity.edu.lsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ktdsuniversity.edu.lsh.bbs.dao.mapper")
@SpringBootApplication
public class HelloSpringLshApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringLshApplication.class, args);
	}

}

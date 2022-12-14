package com.learn.springCore;

import com.learn.springCore.config.EmailConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(EmailConfig.class)
@EnableScheduling
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}

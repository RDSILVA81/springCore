package com.learn.springCore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "email")
public record EmailConfig(String from, String to, String subject, String password){}

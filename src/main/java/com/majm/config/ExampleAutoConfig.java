package com.majm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类 </br>
 *
 * 1. @ConditionalOnClass，当classpath下发现该类的情况下进行自动配置。
 * 2. @ConditionalOnMissingBean，当Spring Context中不存在该Bean时。
 * 3. @ConditionalOnProperty(prefix = "example.service",value = "enabled",havingValue = "true")，当配置文件中example.service.enabled=true时。
 *
 * @author majunmin
 * @description
 * @datetime 2019-07-04 17:57
 * @since
 */
@Configuration
@ConditionalOnClass(ExampleService.class)
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleAutoConfig {

    private final ExampleProperties exampleProperties;

    @Autowired
    public ExampleAutoConfig(ExampleProperties exampleProperties) {
        this.exampleProperties = exampleProperties;
    }


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "com.service", value = "enabled", havingValue = "true")
    ExampleService exampleService(){
        return new ExampleService(exampleProperties.getName(), exampleProperties.getDesc());
    }


}

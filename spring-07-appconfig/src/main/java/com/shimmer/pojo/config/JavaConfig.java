package com.shimmer.pojo.config;

import com.shimmer.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Hui Li on 2021/1/10 20:38
 */
@Configuration //该类也会被托管到IOC容器中，等同与xml配置
@ComponentScan("com.shimmer.pojo") //扫描该包下的所有component
@Import(JavaConfig2.class)
public class JavaConfig {
    @Bean
    public User myUser(){
        return new User();
    }
}

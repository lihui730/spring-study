package com.shimmer.pojo.config;

import com.shimmer.pojo.UserType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Hui Li on 2021/1/10 21:12
 */
@Configuration
public class JavaConfig2 {

    @Bean
    public UserType getType() {
        return new UserType();
    }
}

package com.shimmer.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Hui Li on 2021/1/10 20:36
 */
@Component //该类被IOC容器接管
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("test")
    public void setName(String name) {
        this.name = name;
    }
}

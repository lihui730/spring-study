package com.shimmer.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Hui Li on 2021/1/10 21:13
 */
@Component
public class UserType {
    public String getType() {
        return type;
    }

    @Value("test-type")
    public void setType(String type) {
        this.type = type;
    }

    private String type;

}

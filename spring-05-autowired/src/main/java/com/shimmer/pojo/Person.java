package com.shimmer.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Hui Li on 2021/1/6 21:03
 */
public class Person {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

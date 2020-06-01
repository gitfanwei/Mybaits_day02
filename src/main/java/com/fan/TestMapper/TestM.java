package com.fan.TestMapper;

import java.io.Serializable;

public class TestM implements Serializable {
    private String name;
    private String age;
    private int id;
    private String ai;

    public TestM() {
    }

    public TestM(String name, String age, int id, String ai) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.ai = ai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    @Override
    public String toString() {
        return "TestM{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                ", ai='" + ai + '\'' +
                '}';
    }
}

package com.company;

public class Person extends Family {
    private String name;
    private String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

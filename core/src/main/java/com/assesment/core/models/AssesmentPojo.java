package com.assesment.core.models;

public class AssesmentPojo {
    private String path;
    private String name;

    public AssesmentPojo(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }
    
}

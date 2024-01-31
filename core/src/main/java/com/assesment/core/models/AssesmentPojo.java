package com.assesment.core.models;

public class AssesmentPojo {
    private String path;
    private String template;

    public AssesmentPojo(String path, String template) {
        this.path = path;
        this.template = template;
    }

    public String getPath() {
        return path;
    }

    public String getTemplate() {
        return template;
    }
    
}

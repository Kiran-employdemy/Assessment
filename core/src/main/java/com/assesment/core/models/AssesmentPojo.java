package com.assesment.core.models;

import java.util.Date;

public class AssesmentPojo {
    private String categories;
    private String fileReference;
    private Date date;
    private String title;

    public AssesmentPojo(String categories, String fileReference, Date date, String title) {
        this.categories = categories;
        this.fileReference = fileReference;
        this.date = date;
        this.title = title;
    }
    public String getCategories() {
        return categories;
    }
    public String getFileReference() {
        return fileReference;
    }
    public Date getDate() {
        return date;
    }
    public String getTitle() {
        return title;
    }

    
}

package com.assesment.core.models;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AssesmentModel {
    @ValueMapValue
    @Default(values="No resourceType")
    private String path;

    @ValueMapValue
    @Default(values="No resourceType")
    private String number;

    private List<AssesmentPojo> pageInfoList;

    @PostConstruct
    protected void init() {
       
    }







}

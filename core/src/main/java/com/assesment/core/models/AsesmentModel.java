package com.assesment.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.assesment.core.services.AssesmentService;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AsesmentModel {
    @ValueMapValue
    @Default(values="No path given")
    private String path;

    @ValueMapValue
    @Default(values="No template given")
    private String template;

    public String getPath() {
        return path;
    }

    public String getTemplate() {
        return template;
    }

    public List<AssesmentPojo> getPageInfoList() {
        return pageInfoList;
    }

    @OSGiService 
    AssesmentService assesmentService;

    private List<AssesmentPojo> pageInfoList=new ArrayList<AssesmentPojo>();

    @PostConstruct
    protected void init() throws LoginException, RepositoryException {
       pageInfoList=assesmentService.getPages(path, template);
    } 
}

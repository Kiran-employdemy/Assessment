package com.assesment.core.services;

import java.util.List;

import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.LoginException;

import com.assesment.core.models.AssesmentPojo;

public interface AssesmentService {
    List<AssesmentPojo> getPages(String path,String template) throws LoginException, RepositoryException;
}

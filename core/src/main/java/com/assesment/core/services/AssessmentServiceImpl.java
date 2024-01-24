package com.assesment.core.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.day.cq.wcm.api.Page;

@Component(immediate = true, service = AssesmentService.class, name = "com.aem.geeks.core.services.ComponentsInfo", 
		property = {
		"service.description=AEM GEEKS Training" })
public class AssessmentServiceImpl implements AssesmentService {
    
     public Map<String,String> createTextSearchQuery(String path,int number){
        Map<String,String> queryMap=new HashMap<>();
        //Integer num=(Integer)number;
        queryMap.put("path","path");
        queryMap.put("type","cq:page");
        queryMap.put("p.limit",Integer.toString(number));
      
        return queryMap;
    }

    @Override
    public List<Page> getPages(String path) {
        
        
        return null;
        
    }
    
}

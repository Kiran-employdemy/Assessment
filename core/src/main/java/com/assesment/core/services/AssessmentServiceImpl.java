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
    
     public Map<String,String> createTextSearchQuery(String parentpath,int number){
        Map<String,String> queryMap=new HashMap<>();
        //Integer num=(Integer)number;
        queryMap.put("type","cq:page");
        queryMap.put("path",parentpath);
        queryMap.put("property","jcr:content/cq:template");
        queryMap.put("property.value","/conf/assesment/settings/wcm/templates/assesmenttemplate");
        queryMap.put("p.limit",Integer.toString(number));  
        return queryMap;
    }

    @Override
    public List<Page> getPages(String path) {
        
        
        return null;
        
    }
    
}

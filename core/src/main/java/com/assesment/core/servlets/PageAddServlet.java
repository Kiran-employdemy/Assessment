// package com.assesment.core.servlets;

// import java.io.IOException;

// import javax.servlet.Servlet;
// import javax.servlet.ServletException;

// import org.apache.sling.api.SlingHttpServletRequest;
// import org.apache.sling.api.SlingHttpServletResponse;
// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ResourceResolver;
// import org.apache.sling.api.resource.ResourceResolverFactory;
// import org.apache.sling.api.servlets.SlingAllMethodsServlet;
// import org.apache.sling.servlets.annotations.SlingServletPaths;
// import org.osgi.service.component.annotations.Component;
// import org.osgi.service.component.annotations.Reference;

// import com.assesment.core.utils.ResolverUtil;
// import com.day.cq.wcm.api.Page;
// import com.day.cq.wcm.api.PageManager;




// @Component(service = { Servlet.class })
// @SlingServletPaths(
//         value = {"/bin/createcustompages"}
// )
// public class PageAddServlet extends SlingAllMethodsServlet {
	
//     @Reference
//     ResourceResolverFactory resolverFactory;

//     @Override
//     protected void doGet(SlingHttpServletRequest req, SlingHttpServletResponse resp)
//             throws ServletException, IOException {
   
//                 Page newPage;
//                 PageManager pagemanager;
//                 ResourceResolver resourceResolver;
//                 Resource resource;
//                 com.day.cq.wcm.api.Page page;
//         try {
//             String pagePath="/content/assesment/article-pages";
//             String templatePath="/conf/assesment/settings/wcm/templates/assesmenttemplate";
//             String pageTitle="firstpage";
//             String pageName ="firstpage";

//             resourceResolver=ResolverUtil.newResolver(resolverFactory);
//             //resourceResolver=req.getResourceResolver();
//             pagemanager=resourceResolver.adaptTo(PageManager.class);
//             page=pagemanager.create(pagePath,pageTitle,templatePath, pageName);

//             resourceResolver.commit();
    
//             resp.getWriter().write("======FORM SUBMITTED p========");  
//         }catch (Exception e){
            
            
//            e.printStackTrace();
//         }
//         resp.getWriter().write("======FORM SUBMITTED p========");

//     }

// }

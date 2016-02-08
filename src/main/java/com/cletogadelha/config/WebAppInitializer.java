package com.cletogadelha.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.cletogadelha.filters.CorsFilter;  
  
public class WebAppInitializer implements WebApplicationInitializer {
	public void onStartup(ServletContext servletContext) throws ServletException {  
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(AppConfig.class);  
        ctx.setServletContext(servletContext);    
        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);  
        
        FilterRegistration.Dynamic corsFilter = servletContext.addFilter("corsFilter", CorsFilter.class);
        corsFilter.addMappingForUrlPatterns(null, false, "/*");
   }  
}

package com.cletogadelha.config;  
  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
  
@ComponentScan("com.cletogadelha") 
@EnableWebMvc   
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.cletogadelha.repository"})
@EnableTransactionManagement
@EntityScan(basePackages = {"com.cletogadelha.entity"})
public class AppConfig {  
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}
	
//    @Bean
//    public CommonsMultipartResolver commonsMultipartResolver() {
//        final CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
//        commonsMultipartResolver.setMaxUploadSize(1000);
//
//        return commonsMultipartResolver;
//    }
//    
//    @Bean
//    public FilterRegistrationBean multipartFilterRegistrationBean() {
//        final MultipartFilter multipartFilter = new MultipartFilter();
//        final FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(multipartFilter);
//        filterRegistrationBean.addInitParameter("multipartResolver", "commonsMultipartResolver");
//        return filterRegistrationBean;
//    }

}  

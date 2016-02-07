package com.cletogadelha.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cletogadelha.repository.CompanyRepository;

@Component
public class CompanyLoader implements ApplicationListener<ContextRefreshedEvent> {
 
    private CompanyRepository companyRepository;
 
    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
 
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
		
//		Colaborador colab = new Colaborador("Jack Bauer", "Desenvolvedor de Software", "Fábrica de Software");

//		colabRepository.save(colab);
    	
    }
}

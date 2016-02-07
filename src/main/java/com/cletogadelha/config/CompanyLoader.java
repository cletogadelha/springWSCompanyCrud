package com.cletogadelha.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Company;
import com.cletogadelha.entity.Employee;
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
    	Company company = new Company();
    	company.setName("Best Company!");
    	company.setAddress("Best Address!");
    	company.setEmail("bestcompany@email.com");
    	company.setCountry("Brazil");
    	company.setCity("Brasilia");
    	company.setPhoneNumber("+5599999999");
    	
    	List<Employee> list = new ArrayList<>();
    	
    	for(int i=0;i<5;i++){
    		Employee emp = new Employee();
    		emp.setName("Employee-"+i);
    		emp.setDepartment("Department-"+i);
    		emp.setPositionTitle("Developer-"+i);
    		emp.setSalary("Salary-"+i);
    		emp.setCompany(company);
    		list.add(emp);
    	}
    	
    	company.setEmployeeList(list);
    	
    	companyRepository.save(company);
    }
}

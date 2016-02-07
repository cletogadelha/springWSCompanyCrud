package com.cletogadelha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cletogadelha.entity.Company;
import com.cletogadelha.repository.CompanyRepository;

@Component
public class CompanyServiceImpl implements CompanyService {
	
	private final CompanyRepository repository;
	
	@Autowired
	public CompanyServiceImpl(CompanyRepository repository){
		this.repository = repository;
	}
	
	public Company getCompanyDetail(Integer id){
		return (Company) repository.findOne(id);
	}

	@Override
	public List<Company> getCompanyList() {
		return (List<Company>)repository.findAll();
	}

	@Override
	public Company saveCompany(Company company) {
		return repository.save(company);
	}

	@Override
	public void removeCompany(Integer id) {
		repository.delete(id);
	}
}

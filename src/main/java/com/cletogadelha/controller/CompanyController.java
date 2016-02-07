package com.cletogadelha.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cletogadelha.entity.Company;
import com.cletogadelha.service.CompanyService;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/rest/colaborador")
public class CompanyController {
	
	@Autowired
	private CompanyService colabService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Company getCompanyDetail(@PathVariable("id") Integer id) {
		return colabService.getCompanyDetail(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Company> getCompanyList() {
		return colabService.getCompanyList();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Company saveCompany(@RequestBody @Valid Company company){
		return colabService.saveCompany(company);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Company updateCompany(@PathVariable("id") Integer id, @RequestBody @Valid Company company) {
		return colabService.saveCompany(company);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> removeCompany(@PathVariable("id") Integer id){
		colabService.removeCompany(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
package com.cletogadelha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class BeneficialOwner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;	
	private String name;
	
	@ManyToOne
	@JsonBackReference
    private Company company;
	
	public BeneficialOwner(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}	
	
}

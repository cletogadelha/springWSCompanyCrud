package com.cletogadelha.repository;

import org.springframework.data.repository.CrudRepository;

import com.cletogadelha.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
}

package com.cletogadelha.service;

import java.util.List;

import com.cletogadelha.entity.Company;

public interface CompanyService {
  public Company getCompanyDetail(Integer id);
  public List<Company> getCompanyList();
  public Company saveCompany(Company company);
  public void removeCompany(Integer id);
}

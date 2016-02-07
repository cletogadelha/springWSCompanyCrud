package com.cletogadelha.repository;

import org.springframework.data.repository.CrudRepository;

import com.cletogadelha.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

package com.rest.example.jpapagingsortingfiltering.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.example.jpapagingsortingfiltering.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

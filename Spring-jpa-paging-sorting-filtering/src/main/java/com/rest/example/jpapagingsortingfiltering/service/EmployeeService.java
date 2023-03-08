package com.rest.example.jpapagingsortingfiltering.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rest.example.jpapagingsortingfiltering.model.Employee;
import com.rest.example.jpapagingsortingfiltering.model.EmployeePage;
import com.rest.example.jpapagingsortingfiltering.model.EmployeeSearchCriteria;
import com.rest.example.jpapagingsortingfiltering.repository.EmployeeCriteriaRepository;
import com.rest.example.jpapagingsortingfiltering.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}

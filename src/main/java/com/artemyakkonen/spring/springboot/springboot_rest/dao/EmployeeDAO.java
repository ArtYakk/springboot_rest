package com.artemyakkonen.spring.springboot.springboot_rest.dao;


import com.artemyakkonen.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

   public Employee saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

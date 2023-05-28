package com.kenant42.jsfstudies;

import com.kenant42.jsfstudies.entities.Employee;
import jakarta.faces.bean.ManagedBean;

import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "companybean")
public class Company {

    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        for(int i=0;i<=20;i++){
           Employee employee =  new Employee();
           employee.setId(i);
           employee.setName("name " + i);
           employee.setAge(i);
           employee.setDepartment("department " + i);
           employee.setSalary(i*100L);
           employees.add(employee);
        }
        return employees;

    }

}

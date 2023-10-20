package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.customexception.IdNotFoundException;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String setData(Employee a)
	{
		er.save(a);
		return "Add Successfully";		
	}
	public String setData1(List<Employee> b)
	{
		er.saveAll(b);
		return "Add All Successfully";
	}
	public List<Employee> getData()
	{
		return er.findAll();
	}
	public Employee getData1(int t)
	{
		return er.findById(t).get();
	}
	public String deleteById(int d)
	{
		er.deleteById(d);
		return "delete successfully";
	}
	public String putData(Employee b)
	{
		er.save(b);
		return "Update Successfully";
	}
	public String set1(List<Employee> b)
	{
		er.saveAll(b);
		return "Add All Successfully";
	}
	public Employee get1(int t)
	{
		return er.findById(t).get();
	}
	public Employee get2(int a)throws IdNotFoundException
	{
		return er.findById(a).orElseThrow(()->new IdNotFoundException("Id not found"));
	}
}

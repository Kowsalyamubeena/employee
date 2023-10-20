package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.customexception.IdNotFoundException;
import com.employee.customexception.SalaryNotFoundException;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	@Autowired
	EmployeeRepository er;
	public String setData(Employee a)
	{
		return ed.setData(a);	
	}
	public String setData1(List<Employee> a)
	{
		return ed.setData1(a);
	}
	public List<Employee> getData()
	{
		return ed.getData();
	}
	public Employee getData1(int b)
	{
		return ed.getData1(b);
	}
	public String deleteById(int c)
	{
		return ed.deleteById(c);
	}
	public String putData(Employee b)
	{
		return ed.putData(b);
	}
	public String set1(List<Employee> e) throws SalaryNotFoundException
	{
		List<Employee> em=e.stream().filter(x->x.getSalary()>50000).toList();
		if(em.isEmpty())
		{
			return ed.set1(em);
		}
		else
		{
			throw new SalaryNotFoundException("That value not allow");
		}
	}
	public Employee get1(int a)throws IdNotFoundException
	{
		List<Employee>mm=getData();
		List<Employee> m=mm.stream().filter(x->x.getId()!=x.getId()).toList();
		if(m.isEmpty())
		{
			throw new IdNotFoundException("Id not found");
		}
		else
		{
			return ed.get1(a);
		}
	}
	public Employee get2(int d)throws IdNotFoundException
	{
		return ed.get2(d);
	}
}

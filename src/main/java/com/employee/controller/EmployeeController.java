package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.customexception.IdNotFoundException;
import com.employee.customexception.SalaryNotFoundException;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(path = "/setValue")
	public String setData(@RequestBody Employee b) {
		return es.setData(b);
	}

	@PostMapping(path = "/setValue1")
	public String setData1(@RequestBody List<Employee> b) {
		return es.setData1(b);
	}

	@GetMapping(path = "/getValue")
	public List<Employee> getData() {
		return es.getData();
	}

	@GetMapping(path = "/getValue1/{a}")
	public Employee getData1(@PathVariable int a) {
		return es.getData1(a);
	}

	@DeleteMapping(path = "gets/{b}")
	public String deleteById(@PathVariable int b) {
		return es.deleteById(b);
	}

	@PutMapping(path = "get")
	public String putData(@RequestBody Employee b) {
		return es.putData(b);
	}

	@PostMapping(path = "/set1")
	public String set1(@RequestBody List<Employee> e) throws SalaryNotFoundException {
		return es.set1(e);
	}

	@GetMapping(path = "/get1/{b}")
	public Employee get1(@PathVariable int b) throws IdNotFoundException {
		return es.get1(b);
	}

	@GetMapping(path = "/get2/{c}")
	public Employee get2(@PathVariable int c) throws IdNotFoundException {
		return es.get2(c);
	}

}

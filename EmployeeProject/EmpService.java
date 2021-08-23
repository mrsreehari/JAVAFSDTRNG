package com.ust.springboot;

import java.util.List;

public interface EmpService {
	List <Emp> getEmployees();
	void saveemployee(Emp employee);
	Emp getEmployeeById(long id);
	void deleteEmployeeById(long id);
}

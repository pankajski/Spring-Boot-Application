package in.cdac.springsecutity.learn.spring.security.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@GetMapping("/empList")
	public List<Employees> employeeList() {
		return List.of(new Employees(101, "John Wick"), new Employees(102, "Mike Wilson"));
	}
}

record Employees(int id, String name) {};

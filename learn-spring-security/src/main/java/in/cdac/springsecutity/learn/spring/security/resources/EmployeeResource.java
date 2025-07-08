package in.cdac.springsecutity.learn.spring.security.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private static final List<Employees> Emp_List = 
			 List.of(new Employees(101, "John Wick"), new Employees(102, "Mike Wilson"));
	
	@GetMapping("/empList")
	public List<Employees> employeeList() {
		return Emp_List;
	}
	
	@GetMapping("/employees/{empName}/emp")
	public Employees retrieveSpecificUser(@PathVariable String empName) {
		return Emp_List.get(0);
	}

	@PostMapping("/employees/{empName}/emp")
	public void createTodoForSpecificUser(@PathVariable String empName
			, @RequestBody Employees emp) {
		logger.info("Create {} for {}", emp, empName);
	}
}

record Employees(int id, String empName) {};

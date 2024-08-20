package p1.sprmvn;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value = "getAllEmployee")
	public List<Employee> getAllEmployee() {
		return Arrays.asList(new Employee(1, "Sam", 1000),
				new Employee(2, "Pam", 2000),
				new Employee(3, "Dam", 3000)
				);
	}
}

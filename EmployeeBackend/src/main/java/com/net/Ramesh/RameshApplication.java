package com.net.Ramesh;

import com.net.Ramesh.model.Employee;
import com.net.Ramesh.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RameshApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RameshApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee =new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Manepalli");
		employee.setEmailId("rameshmanepalli14@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 =new Employee();
		employee1.setFirstName("cena");
		employee1.setLastName("kumar");
		employee1.setEmailId("cena@gmail.com");
		employeeRepository.save(employee1);

	}
}

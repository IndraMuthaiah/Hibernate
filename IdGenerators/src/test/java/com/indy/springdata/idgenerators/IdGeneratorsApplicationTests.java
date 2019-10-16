package com.indy.springdata.idgenerators;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.indy.springdata.idgenerators.entities.Employee;
import com.indy.springdata.idgenerators.repos.EmployeeRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdGeneratorsApplicationTests {
	@Autowired
	EmployeeRepo repo;

	@Test
	public void createEmployee() {
		Employee emp = new Employee();
		emp.setName("Manas");
//		emp.setId(2);
		repo.save(emp);
	}

}

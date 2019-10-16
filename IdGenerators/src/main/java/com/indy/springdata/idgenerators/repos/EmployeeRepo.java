package com.indy.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;
import com.indy.springdata.idgenerators.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}

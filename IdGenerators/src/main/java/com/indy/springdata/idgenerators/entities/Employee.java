package com.indy.springdata.idgenerators.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {

//	@TableGenerator(name = "emp_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
//	@GeneratedValue(strategy = GenerationType.TABLE,generator = "emp_gen")

//	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@GenericGenerator(name = "emp_id", strategy = "com.indy.springdata.idgenerators.CustomRandomIDGenerator")
	@GeneratedValue(generator = "emp_id")
	@Id
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

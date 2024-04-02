package com.web.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String Ioc;

	@OneToMany(mappedBy = "dept")
	private List<Employee> emp;
}

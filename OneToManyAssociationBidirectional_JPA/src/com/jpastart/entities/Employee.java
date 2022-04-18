package com.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	private int eid;
	
	private String ename;
	private int esalary;
	
	@ManyToOne
	@JoinColumn(name="deptid")
	private Department department;

	public int getEid()
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public int getEsalary()
	{
		return esalary;
	}

	public void setEsalary(int esalary)
	{
		this.esalary = esalary;
	}

	public Department getDepartment()
	{
		return department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}
}

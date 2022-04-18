package com.tns.jpastart.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")	//value for manager rows in Discriminator column
public class Manager extends Employee
{
	private static final long serialVersionUID = 1L;
	
	private String deptName;

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
}

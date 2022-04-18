package com.tns.jpacrud.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String name, city;

	public Student()
	{
		
	}
	public Student(int id, String name, String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public int getStudentId()
	{
		return id;
	}
	public void setStudentId(int studentId)
	{
		this.id = studentId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
}
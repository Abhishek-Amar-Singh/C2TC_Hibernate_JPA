package com.tns.jpacrud.dao;

import com.tns.jpacrud.entities.Student;

public interface StudentDao
{
	public abstract Student getStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}

//dao stands for data accessible object
package com.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import com.spring.dao.Student;

/**
 * interface defining the CRUD operations for application 
 */
public interface StudentDAO {
	
	/**
	 * Sets the data source, i.e sets the database connection
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * Inserts new Student Record
	 * @param id
	 * @param name
	 * @param age
	 */
	public void insertStudentRecord(int id, String name, int age);
	
	/**
	 * Gets a Student Record
	 * @param id
	 * @return
	 */
	public Student getStudentRecord(int id);
	
	/**
	 * Gets a List of Student Record
	 * @return
	 */
	public List<Student> getStudentList();
	
	/**
	 * Deletes a single Student Record based on student id
	 * @param id
	 */
	public void deleteStudentRecord(int id);
	
	/**
	 * updates existing student record
	 * @param id
	 */
	public void updateStudentRecord(int id, int age);
}

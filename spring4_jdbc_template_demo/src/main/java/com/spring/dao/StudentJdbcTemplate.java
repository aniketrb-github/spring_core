package com.spring.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.dao.Student;

@Component
public class StudentJdbcTemplate implements StudentDAO{

	DataSource dataSource;
	JdbcTemplate jdbcTemplateObject; 	// add maven dep in pom
	
	String sql = "";
	int count = -1;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void insertStudentRecord(int id, String name, int age) {
		sql = "INSERT INTO student(id, name, age) VALUES(?, ?, ?)";
		count = jdbcTemplateObject.update(sql, id, name, age);
		if(count>0){
			System.out.println("Student Record created\nId: "+id+"\nName: "+name+"\nAge: "+age);
		}else{
			System.out.println("Failed to Insert Student Reocrd into DB with Student ID : "+id);
		}
	}
	
	public void deleteStudentRecord(int id) {
		sql = "DELETE FROM student WHERE id = ?";
		count = jdbcTemplateObject.update(sql, id);
		if(count>0){
			System.out.println("Student Record with Student ID: "+id+" is been Deleted Successfully !");
		}else{
			System.out.println("Failed to Delte Student Record from DB with Student ID : "+id);
		}
	}

	public void updateStudentRecord(int id, int age) {
		sql = "UPDATE student SET age = ? WHERE id = ?";
		count = jdbcTemplateObject.update(sql, age, id);
		if(count>0){
			System.out.println("Student Record with Student ID: "+id+" is been updated Successfully !");
		}else{
			System.out.println("Failed to Update the student record with student Id: "+id);
		}
	}

	public Student getStudentRecord(int id) {
		sql = "SELECT * FROM student WHERE id = ?";
		Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
		return student;
	}

	public List<Student> getStudentList() {
		sql = "SELECT * FROM student";
		List<Student> studentList = jdbcTemplateObject.query(sql, new StudentMapper());
		return studentList;
	}
	
	public void displayStudentList(List<Student> studentList){
		System.out.println("Displaying the List of Student as Follows :");
		
		for(int count=0; count<studentList.size(); count++){
			Student student = studentList.get(count);
			System.out.println("\n\nStudent Name: "+student.getName()
					+ "\nStudent ID: "+student.getId()
					+ "\nStudent Age: "+student.getAge());
		}
	}
	
	public void displayStudent(Student student){
		System.out.println("\n\nStudent Name: "+student.getName()
		+ "\nStudent ID: "+student.getId()
		+ "\nStudent Age: "+student.getAge());
	}
}

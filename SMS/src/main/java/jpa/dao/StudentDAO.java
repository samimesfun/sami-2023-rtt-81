package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	
	public List<Student> getAllStudents();

	public Student getStudentByEmail(String sEmail);

    public boolean validateStudent(String sEmail,String sPassword);

	public void registerStudentToCourse(String sEmail,int cID);

	public List<Course> getStudentCourses();
}

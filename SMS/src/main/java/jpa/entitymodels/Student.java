package jpa.entitymodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jpa.entitymodels.Course;
import jpa.mainrunner.SMSRunner;

@Entity
@Table(name = "student")
public class Student {

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<StudentCourse> studentcourse;
	@Id
	@Column(name = "email")
	private String sEmail;

	@Column(name = "name")
	private String sName;

	@Column(name = "password")
	private String sPassword;

	// --------getter and setter -------

	public List<StudentCourse> getStudentcourses() {
		return studentcourse;
	}

	public List<StudentCourse> getStudentcourse() {
		return studentcourse;
	}

	public void setStudentcourse(List<StudentCourse> studentcourse) {
		this.studentcourse = studentcourse;
	}

	public void setStudentcourses(List<StudentCourse> studentcourse) {
		this.studentcourse = studentcourse;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

}

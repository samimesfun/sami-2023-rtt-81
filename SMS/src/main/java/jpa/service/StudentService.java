package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;

public class StudentService implements StudentDAO {

	public List<Student> getAllStudents() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Student";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);

		List<Student> students = query.getResultList();

		session.close();

		return students;

	}

	public Student getStudentByEmail(String sEmail) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Student s WHERE s.sEmail = :sEmail";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);

		query.setParameter("sEmail", sEmail);
	    return query.getSingleResult();
		
	}

	public boolean validateStudent(String sEmail, String sPassword) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Student s WHERE s.sEmail = :sEmail";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("sEmail", sEmail);

		Student student = query.getSingleResult();

		session.close();

		if (student == null) {
			return false;
		}

		if (!student.getsPassword().equals(sPassword)) {
			return false;
		}

		return true;

	}

	public void registerStudentToCourse(String sEmail, int cID) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		StudentService sService = new StudentService();
		Student student = sService.getStudentByEmail(sEmail);
		CourseService courseService=new CourseService();
		Course course = courseService.getCourseById(cID);
		StudentCourse sc = new StudentCourse(student,course);
		Transaction t = session.beginTransaction();
		session.saveOrUpdate(sc);
		t.commit();

	}

	public List<Course> getStudentCourses(String sEmail) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM StudentCourse sc where sc.student.sEmail = :sEmail";
		TypedQuery<StudentCourse> query = session.createQuery(hql, StudentCourse.class);
		query.setParameter("sEmail", sEmail);
		List<StudentCourse> result = query.getResultList();
		List<Course> courses = new ArrayList<>();
		for (StudentCourse studentCourse : result) {
			Course course = studentCourse.getCourse();
			courses.add(course);
		}
		return courses;
	}

	@Override
	public List<Course> getStudentCourses() {
		// TODO Auto-generated method stub
		return null;
	}
}

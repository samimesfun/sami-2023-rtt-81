package jpa.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService implements CourseDAO {
	
	public CourseService(){
		
	}
	     public List<Course> getAllCourses(){
	    	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 		Session session = factory.openSession();

	 		String hql = "FROM Course";

	 		  TypedQuery<Course> query = session.createQuery(hql, Course.class);

	 		  List<Course> courses = query.getResultList();

	 		  session.close();

	 		  return courses;
	    	 
	     }
	     public Course getCourseById(Integer cId) {
	    	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 		Session session = factory.openSession();
	 		String hql = "FROM Course c where c.cId = :cId";
	 		TypedQuery<Course> query = session.createQuery(hql, Course.class);
	 		query.setParameter("cId", cId);
	 		Course result = query.getSingleResult();
	 		return result;
	 	}

}

package jpaadvanced.advancedJpaHibernate.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jpaadvanced.advancedJpaHibernate.entity.Course;
import jpaadvanced.advancedJpaHibernate.entity.Review;

@Repository
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	public Course findById(int id) {
		return em.find(Course.class, id);
	}
	
	public Course save(Course course) {
		return em.merge(course);
	}
	
	public void deleteById(int id) {
		Course course = findById(id);
		em.remove(course);
		
	}
	@Transactional
	public void addReviewsForCourse(int courseId, List<Review> reviews) {
		Course course = findById(courseId);
		for(Review review : reviews) {
			course.addReview(review);
			review.setCourse(course);
			em.persist(review);
		}
	}
}

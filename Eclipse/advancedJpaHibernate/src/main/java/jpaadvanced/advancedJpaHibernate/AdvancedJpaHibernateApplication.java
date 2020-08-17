package jpaadvanced.advancedJpaHibernate;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpaadvanced.advancedJpaHibernate.entity.Course;
import jpaadvanced.advancedJpaHibernate.entity.Review;
import jpaadvanced.advancedJpaHibernate.repository.CourseRepository;
import jpaadvanced.advancedJpaHibernate.repository.StudentRepository;

@SpringBootApplication
public class AdvancedJpaHibernateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AdvancedJpaHibernateApplication.class, args);
	}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Course course = courseRepository.findById(10001);
		logger.info("Course{}", course);
		studentRepository.saveStudentWithPassport();
		
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("5", "Best Course"));
		reviews.add(new Review("3", "maybe not"));
		reviews.add(new Review("5", "Yes it is"));
		
		courseRepository.addReviewsForCourse(10001, reviews);
		
		
	}
	

}

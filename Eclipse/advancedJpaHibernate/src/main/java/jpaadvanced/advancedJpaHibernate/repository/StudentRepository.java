package jpaadvanced.advancedJpaHibernate.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jpaadvanced.advancedJpaHibernate.entity.Passport;
import jpaadvanced.advancedJpaHibernate.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	EntityManager em;
	
	public Student findById(int id) {
		return em.find(Student.class, id);
	}
	
	public Student save(Student student) {
		return em.merge(student);
	}
	
	public void saveStudentWithPassport() {
		Passport passport = new Passport("Z123456");
		em.persist(passport);
		Student student = new Student("mike");
		student.setPassport(passport);
		em.persist(student);
	}
	
	public void deleteById(int id) {
		Student student = findById(id);
		em.remove(student);
		
	}
}

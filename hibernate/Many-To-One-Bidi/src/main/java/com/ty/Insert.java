package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		University university = new University(101, "Mumbai");

		Student student1 = new Student(111, "Rahul");
		student1.setUniversity(university);

		Student student2 = new Student(222, "Ash");
		student2.setUniversity(university);

		em.persist(university);
		em.persist(student1);
		em.persist(student2);

		em.getTransaction().commit();
	}
}

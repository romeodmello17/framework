package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department = new Department();
		department.setId(101);
		department.setName("Accounts");

		Employee e1 = new Employee();
		e1.setId(111);
		e1.setName("Rahul");
		e1.setDepartment(department);

		Employee e2 = new Employee();
		e2.setId(222);
		e2.setName("Ash");
		e2.setDepartment(department);

		Employee e3 = new Employee();
		e3.setId(333);
		e3.setName("Romeo");
		e3.setDepartment(department);

		em.persist(department);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);

		em.getTransaction().commit();

	}
}

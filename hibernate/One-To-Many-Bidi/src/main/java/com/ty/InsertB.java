package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertB {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Department department = em.find(Department.class, 102);

		Employee employee1 = new Employee(555, "AK");
		employee1.setDepartment(department);

		Employee employee2 = new Employee(666, "Sachin");
		employee2.setDepartment(department);

		em.persist(employee1);
		em.persist(employee2);

		em.getTransaction().commit();
	}
}

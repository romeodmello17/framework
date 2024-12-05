package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department = new Department(102, "IT");

		Employee employee = new Employee(444, "Rutik");
		employee.setDepartment(department);

		em.persist(department);
		em.persist(employee);

		em.getTransaction().commit();
	}
}

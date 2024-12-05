package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Employee employee = em.find(Employee.class, 444);

		if (employee != null) {
			em.remove(employee);
			em.getTransaction().commit();
		} else {
			System.err.println("Employee Not Found");
		}
	}
}

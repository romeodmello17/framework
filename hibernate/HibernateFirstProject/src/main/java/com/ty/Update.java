package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Employee emp = em.find(Employee.class, 101);
		emp.setName("Ashh");
		if (emp!= null) {
			et.begin();
			em.merge(emp);
			et.commit();
		}
	}
}
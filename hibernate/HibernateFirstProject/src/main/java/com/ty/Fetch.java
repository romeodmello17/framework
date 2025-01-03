package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

//		EntityTransaction et = em.getTransaction();

//		Employee emp = new Employee();

//		Employee find = em.find(emp.getClass(), 101);
		
		
		Employee find = em.find(Employee.class, 101);
		
		if (find != null) {
			System.out.println("====================Employee Details =========================");
			System.out.println("Employee Id "+ find.getId());
			System.out.println("Employee Name "+ find.getName());
			System.out.println("Employee Salary "+ find.getSalary());
		}else {
			System.err.println("Employee not found");
		}
	}
}

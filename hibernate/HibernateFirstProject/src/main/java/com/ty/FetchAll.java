package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String hql = "select e from Employee e";
		
		Query query = em.createQuery(hql);
		
		List<Employee> employees = query.getResultList();
		
		System.out.println("=========================Employee Details================================");
		for (Employee employee : employees) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("----------------------------------------------------");
		}
		
	}
}

package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		try {

			Employee employee = em.find(Employee.class, 333);
			Department department = em.find(Department.class, 102);
			employee.setName("Rohan");
			employee.setDepartment(department);

			if (employee != null && department != null) {
				em.merge(employee);
				em.getTransaction().commit();
			} else {
				System.err.println("Employee Not Found");
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}

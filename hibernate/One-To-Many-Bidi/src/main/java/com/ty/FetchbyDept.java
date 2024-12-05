package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchbyDept {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Department department = em.find(Department.class, 102);

		if (department != null) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("=================Department Detail================");
			System.out.println(department.getId());
			System.out.println(department.getName());

			System.out.println();
			System.out.println();
			System.out.println();

			List<Employee> employees = department.getEmployees();
			System.out.println("================Employees Details=================="); 
			System.out.println();
			System.out.println();
			for (Employee employee : employees) {
				System.out.println("--------------------------------------------------");
				System.out.println(employee.getId());
				System.out.println(employee.getName());
				System.out.println();
			}

		} else {
			System.err.println("Data Not Found");
		}
	}
}

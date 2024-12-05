package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchbyEmp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Employee employee = em.find(Employee.class, 333);

		if (employee != null) {
			System.out.println("=================Employee Details===============");
			System.out.println(employee.getId());
			System.out.println(employee.getName());

			Department department = employee.getDepartment();

			System.out.println("==============Department Details===============");
			System.out.println(department.getId());
			System.out.println(department.getName());

			List<Employee> employees = department.getEmployees();
			System.out.println("==============Other Employees==================");
			for (Employee employee2 : employees) {
				System.out.println("-------------------------------------------");
				System.out.println(employee2.getId());
				System.out.println(employee2.getName());
			}

		} else {
			System.err.println("Employee not found");
		}
	}
}

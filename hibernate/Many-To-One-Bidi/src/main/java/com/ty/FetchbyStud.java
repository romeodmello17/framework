package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchbyStud {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student student = em.find(Student.class, 444);
		if (student != null) {
			System.out.println("=============Student Details====================");
			System.out.println(student.getId());
			System.out.println(student.getName());

			University university = student.getUniversity();
			System.out.println("=============University Detail==================");
			System.out.println(university.getId());
			System.out.println(university.getName());

			List<Student> students = university.getStudents();
			System.out.println("==================Other Students==================");
			for (Student student2 : students) {
				System.out.println("----------------------------------------------");
				System.out.println(student2.getId());
				System.out.println(student2.getName());
			}
		} else {
			System.err.println("Student not found");
		}
	}
}

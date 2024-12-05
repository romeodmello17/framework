package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		University university = em.find(University.class, 102);

		if (university != null) {
			System.out.println("===========University Details=================");
			System.out.println(university.getId());
			System.out.println(university.getName());

			List<Student> students = university.getStudents();
			System.out.println("========================Students Details===================");

			for (Student student : students) {
				System.out.println("----------------------------------------------");
				System.out.println(student.getId());
				System.out.println(student.getName());
			}

		} else {
			System.err.println("University Not Found");
		}

	}
}

package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		// Fetching Engine from Car
		Car car = em.find(Car.class, 101);

		if (car != null) {

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("=========Car Details========");
			System.out.println(car.getC_id());
			System.out.println(car.getBrand());

			Engine engine = car.getEngine();
			if (engine != null) {

				System.out.println("========Engine Details=====");
				System.out.println(engine.getE_id());
				System.out.println(engine.getCc());
				System.out.println(engine.getType());

				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
			} else {
				System.err.println("Engine Not Found");
			}

		} else {
			System.err.println("Car Not Found");
		}

		System.out.println();
		System.out.println();
		System.out.println();

		// Fetching Car from Engine
		Engine engine2 = em.find(Engine.class, 222);
		if (engine2 != null) {
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("=========Engine Details=========");
			System.out.println(engine2.getE_id());
			System.out.println(engine2.getCc());
			System.out.println(engine2.getType());

			Car car2 = engine2.getCar();
			if (car2 != null) {
				System.out.println("=========Car Details=========");
				System.out.println(car2.getC_id());
				System.out.println(car2.getBrand());

				System.out.println();
				System.out.println();
				System.out.println();

			} else {
				System.err.println("Car not Found");
			}

		} else {
			System.err.println("Engine not Found");

		}
	}
}

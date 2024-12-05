package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		List<Car> cars = em.createQuery("select c from Car c", Car.class).getResultList();

		System.out.println("==================Car Details=====================");

		for (Car car : cars) {
			System.out.println("Car ID : " + car.getC_id());
			System.out.println("Car Brand : " + car.getBrand());

			Engine engine = car.getEngine();
			if (engine != null) {
				System.out.println("============Engine Details==================");
				System.out.println("Engine ID : " + engine.getE_id());
				System.out.println("Engine CC : " + engine.getCc());
				System.out.println("Engine Fuel Type : " + engine.getType());

			} else {
				System.out.println("No Engine is Assigned");
			}
			System.out.println("---------------------------------------------------------------------");
		}
	}
}

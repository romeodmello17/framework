package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		
		Car car = em.find(Car.class, 101);
		
		if (car!= null) {
			Engine engine = car.getEngine();
			System.out.println("Car Details============================");
			System.out.println(car.getCid());
			System.out.println(car.getBrand());
			System.out.println(car.getPrice());
			
			System.out.println("----------------------------------");
			System.out.println(engine.getEid());
			System.out.println(engine.getCc());
			System.out.println(engine.getType());
		}else {
			System.out.println("Data not found");
		}
	}
}

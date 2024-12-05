package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

//		Car car = new Car();
//		car.setC_id(103);
//		car.setBrand("TATA");

		Engine engine = new Engine();
		engine.setE_id(333);
		engine.setCc(33000);
		engine.setType("Rocket Fuel");

//		car.setEngine(engine);

//		em.persist(car);
		em.persist(engine);

		em.getTransaction().commit();

//		//fetching
//		Car car2 = em.find(Car.class, car.getC_id());
//		System.out.println("===========Car Details==============");
//		System.out.println(car2.getC_id() );
//		System.out.println(car2.getBrand());
//		
//		Engine engine2 = car2.getEngine();
//		System.out.println("===========Engine Details===========");
//		System.out.println(engine2.getE_id());
//		System.out.println(engine2.getCc());
//		System.out.println(engine2.getType());
	}

}

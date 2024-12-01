package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Review review = em.find(Review.class, 101);

		if (review != null) {
			System.out.println("==============review================");
			System.out.println(review.getRid());
			System.out.println(review.getMessage());

			System.out.println("-------------------------------------");
			Product product = review.getProduct();
			System.out.println(product.getPid());
			System.out.println(product.getName());
			System.out.println(product.getPrice());

		} else {
			System.err.println("Not found");
		}
	}
}

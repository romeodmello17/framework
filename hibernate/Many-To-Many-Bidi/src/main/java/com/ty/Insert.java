package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Song song1 = new Song(1, "Shape of You");
		Song song2 = new Song(2, "Blinding Lights");
		Song song3 = new Song(3, "Levitating");
		Song song4 = new Song(4, "Uptown Funk");

		Playlist playlist1 = new Playlist(101, "Workout");
		Playlist playlist2 = new Playlist(102, "Relaxation");
		Playlist playlist3 = new Playlist(103, "Party Hits");

		playlist1.setSongs(Arrays.asList(song1, song2, song3));
		playlist2.setSongs(Arrays.asList(song1, song3, song4));

		song1.setPlaylists(Arrays.asList(playlist1, playlist2));
		song2.setPlaylists(Arrays.asList(playlist1, playlist3));

		em.persist(song1);
		em.persist(song2);
		em.persist(song3);
		em.persist(song4);
		em.persist(playlist1);
		em.persist(playlist2);
		em.persist(playlist3);

		em.getTransaction().commit();

	}

}

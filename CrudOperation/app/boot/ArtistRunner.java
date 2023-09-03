package com.xworkz.app.boot;

import com.xworkz.app.repository.ArtistRepository;
import com.xworkz.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ArtistRunner");
		ArtistRepository artist = new ArtistRepositoryImpl();
		artist.movie("Shiva");
		artist.movie("Kantara");
		artist.movie("khushi");
		artist.movie("Kariya");
		artist.movie("Kotigobba");
		artist.movie("Mungarumale");
		artist.movie("Charli");
		artist.movie("Bharma");
		artist.movie("Pogaru");
		artist.movie("KGF2");

	

	}

}

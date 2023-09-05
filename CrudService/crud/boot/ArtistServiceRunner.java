package com.xworkz.crud.boot;

import com.xworkz.app.repository.ArtistRepository;
import com.xworkz.app.repository.ArtistRepositoryImpl;
import com.xworkz.crud.app.ArtistService;
import com.xworkz.crud.app.ArtistServiceImpl;

public class ArtistServiceRunner {
public static void main(String[] args) {
			System.out.println("invoking main ArtistServiceRunner");
			ArtistRepository artistRepository=new ArtistRepositoryImpl();
			ArtistService artistService=new ArtistServiceImpl(artistRepository);
			artistService.validateAndEntertain("Deepika");

		}

	}


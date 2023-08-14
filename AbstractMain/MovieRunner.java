package AbstractMain;

import Abstract.Movie;
import Abstract.NewMovie;


public class MovieRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Movie runner");
		Movie movie = new NewMovie();
		movie.hero();
		movie.heroine();
		movie.comdeien();
		movie.director();
		movie.producer();
		movie.trailer();
		movie.nameboard();
		movie.productionHouse();
		movie.theme();
		movie.inspiration();


	}

}

	

package spring.autowire;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

	@Autowired
	private MovieCatalog[] movieCatalogs;
	
//	private Map<String, MovieCatalog> movieCatalogs;
//
//
//	@Autowired
//	public void setMovieCatalogs(Map<String, MovieCatalog> movieCatalogs) {
//		this.movieCatalogs = movieCatalogs;
//	}


	public MovieRecommender(){
		movieCatalogs = new MovieCatalog[2];
		System.out.println("MovieRecommender created");
	}
	
	public void write(){
		for(MovieCatalog catalog: movieCatalogs){
			System.out.println(catalog.toString());
		}
	}
}

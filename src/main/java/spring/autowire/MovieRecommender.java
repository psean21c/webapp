package spring.autowire;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

	@Autowired
	private MovieCatalog[] movieCatalogs;
	
	private Map<String, MovieCatalog> movieCatalogs2;

//
//	@Autowired
//	public void setMovieCatalogs(Map<String, MovieCatalog> movieCatalogs) {
//		this.movieCatalogs = movieCatalogs;
//	}


	/***
	 * Constructor : 
	 */
	public MovieRecommender(){
		movieCatalogs = new MovieCatalog[2];
		movieCatalogs[0] = new MovieCatalog(0,"Matrix");
		movieCatalogs[1] = new MovieCatalog(1,"GodFather");
				
		System.out.println("MovieRecommender created");
	}
	
	public void write(){
		for(MovieCatalog catalog: movieCatalogs){
			//System.out.println(catalog.toString());
			System.out.println(catalog.getTitle());
		}
	}
}

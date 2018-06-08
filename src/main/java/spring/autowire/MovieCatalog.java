package spring.autowire;

public class MovieCatalog {
	int cnt;
	String title;
	
	/***
	 * Constructor : 
	 */
	public MovieCatalog(){
		System.out.println("MovieCatalog created");
	}
	public MovieCatalog(int cnt, String title) {
		this.cnt = cnt;
		this.title =title;
	}
	
	/***
	 * getter/setter : 
	 */
	public int getCnt() {
		return cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

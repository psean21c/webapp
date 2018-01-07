package spring.basic.beans.constructor.list;

import java.util.List;

public class BookBasket {

	private String name;
	private List<String> books;
	
	
	
	public BookBasket(String name, List<String> books) {
		super();
		this.name = name;
		this.books = books;
	}



	@Override
	public String toString() {
		return "BookBasket [name=" + name + ", books=" + books + "]";
	}


	
}

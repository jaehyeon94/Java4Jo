package Test_20210129;

public class Book {

	protected String name;
	protected int numberPages;
	protected String author;
	
	
	public Book(String name, int numberPages, String author) {
		this.name = name;
		this.numberPages = numberPages;
		this.author = author;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberPages() {
		return numberPages;
	}


	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	
	

}

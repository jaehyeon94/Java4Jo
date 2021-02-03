package Test_20210129;

public class Magazine extends Book {

	private String releaseDate;

	public Magazine(String name, int numberPages, String author, String releaseDate) {
		super(name, numberPages, author);
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
		
}

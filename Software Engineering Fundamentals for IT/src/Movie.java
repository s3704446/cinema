public class Movie {
	
	private String movieID;
	private String movieName;
	private double price;

	public Movie(String movieID, String movieName,double price) {
		this.movieID = movieID;
		this.movieName = movieName;
		this.price = price;
	}
	
	
	public String getMovieID() {
		return this.movieID;
	}
	
	public String getMovieName() {
		return this.movieName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
}

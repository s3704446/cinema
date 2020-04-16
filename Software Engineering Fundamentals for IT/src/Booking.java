
public class Booking {
	
	private String bookingID;
	private String date;
	private Movie movie;
	private Cinema cinema;
	private SessionManager session;
	
	public Booking(String bookingID, String date, Movie movie, Cinema cinema) {
		this.bookingID = bookingID;
		this.date = date;
		this.movie = movie;
		this.cinema = cinema;
	}
	


	
	public String getBookingId() {
		return this.bookingID;
	}
	
	
	public void setSessionID(SessionManager session) {
		this.session = session;
		this.session.addBookingID(this);
	}
	
	public String getDate() {
		return this.date;
	}

	public String getMoive() {
		return this.movie.getMovieName();
	}
	
	public String getCinema() {
		return this.cinema.getCinemaName();
	}

}

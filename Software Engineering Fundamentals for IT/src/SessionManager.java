import java.util.Scanner;

public class SessionManager {
	
	private String sessionID;
	private Booking[] bookings;
	private int sessionSize;
	private int maxSessionSize;
	
	public SessionManager(String sessionID, int maxSessionSize) {
		
		this.sessionID = sessionID;
		this.bookings = new Booking[maxSessionSize];
		
	}
	
	public static void main(String args[]) {
		
		Movie movies[] = new Movie[5];
		movies[0] = new Movie("m00001", "movie1", 14.00);
		movies[1] = new Movie("m00002", "movie2", 15.00);
		movies[2] = new Movie("m00003", "movie3", 16.00);
		movies[3] = new Movie("m00004", "movie4", 17.00);
		movies[4] = new Movie("m00005", "movie5", 19.00);
		
		Cinema cinemas[] = new Cinema[5];
		cinemas[0] = new Cinema("c00001", "Cinema one");
		cinemas[1] = new Cinema("c00002", "Cinema two");
		cinemas[2] = new Cinema("c00003", "Cinema three");
		cinemas[3] = new Cinema("c00004", "Cinema four");
		cinemas[4] = new Cinema("c00005", "Cinema five");
		
		Booking book1 = new Booking("b00001", "11/04/2020", movies[1], cinemas[2]);
		Booking book2 = new Booking("b00002", "12/04/2020", movies[2], cinemas[1]);
		Booking book3 = new Booking("b00003", "12/04/2020", movies[2], cinemas[1]);
		Booking book4 = new Booking("b00004", "13/04/2020", movies[2], cinemas[1]);
		Booking book5 = new Booking("b00005", "13/04/2020", movies[1], cinemas[2]);
		
		
		SessionManager s1 = new SessionManager("session01", 10);
		SessionManager s2 = new SessionManager("session02", 20);
		
		book1.setSessionID(s1);
		book2.setSessionID(s2);
		book3.setSessionID(s2);
		book4.setSessionID(s2);
		book5.setSessionID(s1);
		
		
		for (int i = 0; i < s1.sessionSize; i++) {
			
			System.out.println(s1.sessionID + ": " + s1.bookings[i].getBookingId() + " " + s1.bookings[i].getDate()
					+ " " + s1.bookings[i].getMoive() + " " + s1.bookings[i].getCinema());
		}
		
		
		System.out.println();
		
		
		for (int i = 0; i < s2.sessionSize; i++) {
			System.out.println(s2.sessionID + " " + s2.bookings[i].getBookingId() + " " + s2.bookings[i].getDate()
					+ " " + s2.bookings[i].getMoive() + " " + s2.bookings[i].getCinema());
		}
	}
	
	public void addBookingID(Booking book) {
		bookings[sessionSize] = book;
		sessionSize++;
	}
	
	public String getSessionID() {
		return this.sessionID;
	}

}

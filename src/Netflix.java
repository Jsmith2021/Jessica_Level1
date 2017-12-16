
public class Netflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Frozen", 3);
		Movie movie2 = new Movie("The Last Jedi", 4);
	Movie movie3 = new Movie("The Sound of Music", 4);
		 Movie movie4=new Movie("Intersteller", 5);
		Movie movie5= new Movie("Beauty and the Beast", 2);
		
		movie1.getTicketPrice();
		movie2.getTicketPrice();
		movie3.getTicketPrice();
		movie4.getTicketPrice();
		movie5.getTicketPrice();
		
		NetflixQueue queue= new NetflixQueue();
		
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
queue.addMovie(movie4);
queue.addMovie(movie5);

System.out.println(movie1);
System.out.println(movie2);
System.out.println(movie3);
System.out.println(movie4);
System.out.println(movie5);

	}
}

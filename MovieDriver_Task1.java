import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner keyboardRead= new Scanner(System.in);
		Movie firstMovie=new Movie();
		System.out.println("Enter the name of a movie: ");
		firstMovie.setTitle(keyboardRead.nextLine());
		System.out.println("Enter the rating of the movie: ");
		firstMovie.setRating(keyboardRead.nextLine());
		System.out.println("Enter the number of tickets sold for this movie: ");
		firstMovie.setSoldTickets(keyboardRead.nextInt());
		System.out.println(firstMovie);
		keyboardRead.close();
	}

}

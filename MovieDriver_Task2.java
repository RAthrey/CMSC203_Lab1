import java.util.Scanner;
public class MovieDriver_Task2 {

	public static void main(String[] args) {
		Scanner keyboardRead= new Scanner(System.in);
		String anotherMovie="";
		do {
			Movie firstMovie=new Movie();
			System.out.println("Enter the name of a movie: ");
			firstMovie.setTitle(keyboardRead.nextLine());
			System.out.println("Enter the rating of the movie: ");
			firstMovie.setRating(keyboardRead.nextLine());
			System.out.println("Enter the number of tickets sold for this movie: ");
			firstMovie.setSoldTickets(keyboardRead.nextInt());
			keyboardRead.nextLine();
			System.out.println(firstMovie);
			System.out.println("Do you want to enter another? (y or n): ");
			anotherMovie=keyboardRead.nextLine();
		}while (anotherMovie.equals("y"));
		System.out.println("Goodbye");
		keyboardRead.close();
	}

}

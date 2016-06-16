import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<Movie>();

		Scanner scan = new Scanner(System.in);
		String option;
		String proceed = "yes";

		/*
		 * Movie shawshank = new Movie("Shawshank Redemption", "Drama"); Movie
		 * clerks = new Movie("Clerks", "Comedy"); Movie clerks2 = new
		 * Movie("Clerks 2", "Comedy"); Movie braveheart = new
		 * Movie("Braveheart", "Drama"); Movie jayandbob = new
		 * Movie("Jay and Silent Bob Strike Back", "Comedy"); Movie starwars =
		 * new Movie("Starwars", "SciFi"); Movie aladin = new Movie("Aladin",
		 * "Animated"); Movie lionKing = new Movie("Lion King", "Animated");
		 * Movie inception = new Movie("Inception", "SciFi"); Movie returnJedi =
		 * new Movie("Return of the Jedi", "SciFi"); Movie empireStrikes = new
		 * Movie("The Empire Strikes Back", "SciFi");
		 * 
		 * movieList.add(shawshank); movieList.add(clerks);
		 * movieList.add(clerks2); movieList.add(braveheart);
		 * movieList.add(jayandbob); movieList.add(starwars);
		 * movieList.add(aladin); movieList.add(lionKing);
		 * movieList.add(inception); movieList.add(returnJedi);
		 * movieList.add(empireStrikes);
		 */

		for (int i = 0; i < 100; i++) {
			movieList.add(i, MoviesIO.getMovie(i));
		}

		// sort
		Collections.sort(movieList, new Comparator<Movie>() {
			public int compare(Movie m1, Movie m2) {
				return m1.getTitle().compareToIgnoreCase(m2.getTitle());
			}
		});

		do {
			System.out.println("Welcome to the Move List Application");
			System.out.println("There are 100 movies in ths list");
			System.out.print("What category are you interested in?");
			option = scan.nextLine();

			System.out.println();

			for (Movie s : movieList) {
				if (s.getCategory().equals(option)) {
					System.out.println(s.getTitle());
				}
			}
		} while (Character.toLowerCase(proceed.charAt(0)) == 'p');

		scan.close();
	}
}

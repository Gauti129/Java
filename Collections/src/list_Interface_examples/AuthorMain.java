package list_Interface_examples;

import java.util.ArrayList;
import java.util.Collections;

public class AuthorMain {

	public static void main(String[] args) {

		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("abc", "hyu", 54));
		al.add(new Author("qw", "hffyu", 354));
		al.add(new Author("abddc", "httyu", 5554));
		al.add(new Author("gv", "hyru", 4));

		Collections.sort(al, new AuthorAgeComparator());

		for (Author au : al) {
			System.out.println("Comparator Sort");
			System.out.println(
					"Name:" + au.getFirstName() + "----BookName:" + au.getBookName() + "-----Age:" + au.getAuAge());
		}

		Collections.sort(al);

		for (Author au : al) {
			System.out.println("Comparable Sort");

			System.out.println(
					"Name:" + au.getFirstName() + "----BookName:" + au.getBookName() + "-----Age:" + au.getAuAge());
		}
	}

}

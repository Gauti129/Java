package list_Interface_examples;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author> {

	@Override
	public int compare(Author a1, Author a2) {
		if (a1.getAuAge() == a2.getAuAge())
			return 0;
		else if (a1.getAuAge() > a2.getAuAge())
			return 1;
		else
			return -1;
	}

}

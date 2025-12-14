package javabasics_nonStatic_examples;

public class ObjectReference {

	int x;

	ObjectReference() {

	}

	public static void main(String[] args) {
		ObjectReference ord = new ObjectReference(); // ord (reference) implicitly refer to the address of constructor.
		System.out.println(ord.x);
	}

}

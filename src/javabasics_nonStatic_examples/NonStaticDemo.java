package javabasics_nonStatic_examples;

public class NonStaticDemo {
	
	int num;
	
	NonStaticDemo(){
		System.out.println("Inside Constructor");
	}

	{
		System.out.println("Inside Non Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Main");
		NonStaticDemo obj = new NonStaticDemo();
		new NonStaticDemo();
		new NonStaticDemo();
		obj.doSomeThing();
		
	}
	
	//Non static is executed as many times object is created but static is executed only once.
	static {
		System.out.println("Inside Static block");
	}
	
	void doSomeThing() {
		System.out.println("In Do something");
	}
}

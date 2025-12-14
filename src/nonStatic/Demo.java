package nonStatic;

public class Demo {

	static Demo obj;
	
	static Demo init2;

	static Demo refer = new Demo();

	static {
		System.out.println("Inital Call: " + Demo.obj); // Using Static Variable
		obj = new Demo();
		Demo.init();
		
		Demo.init2 = Demo.init2();
	}
	static {
		Demo demo = new Demo(); // Using Local variable
		System.out.println("Local Variable Call: " + demo);
	}

	public static void main(String[] args) {
		System.out.println("Static Variable Call: " + Demo.obj);

		System.out.println("Refer Variable Call: " + Demo.refer);
		System.out.println("Init2 Variable Call: " + Demo.init2);
	}

	static void init() {
		Demo.refer = new Demo();
	}
	
	static Demo init2() {
		return new Demo();
	}
}

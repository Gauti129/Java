
public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("In main");
		StaticMethods.method1();

	}

	static void method1(){
		System.out.println("In method 1");
	}
	
	//static methods can be called from static block
	static {
		System.out.println("In static block ");
		StaticMethods.method1();
	}
}

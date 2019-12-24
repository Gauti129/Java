
public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Main Method");
	}

	static {
		System.out.println("Static Block 2");
	}
	
	//Order is as per declaration in program
	
	static {
		System.out.println("Static Block 1");
	}

}

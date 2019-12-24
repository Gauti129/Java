package nonStatic;

public class ThisKeyword {

	int x;
	
	ThisKeyword(){
		System.out.println(this);// Will give memory address of constructors created
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();
	}
}

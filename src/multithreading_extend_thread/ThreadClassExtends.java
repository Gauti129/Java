package multithreading_extend_thread;

// Main Class 
public class ThreadClassExtends {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {
			MultiThread object = new MultiThread();
			object.start();
		}
	}
}

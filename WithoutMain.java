package task1;

public class WithoutMain {

	static {
		System.out.println("First static block");
	}
	public static void main(String args[]) {
		System.out.println("Main method");
		m1();
		main1(args);
	}
	public static void main1(String args[]) {
		System.out.println("Main method1");
	}
	static {
		System.out.println("Second static block");
	}
	static void m1() {
		System.out.println("Static method");
	}
}
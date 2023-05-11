package task1;

 class WithoutMain {

	static {
		System.out.println("First static method");
	}
	public static void main(String args[]) {
		System.out.println("Main method");
		m1();
	}
	static {
		System.out.println("Second static method");
	}
	static void m1() {
		System.out.println("Third static method");
	}
}
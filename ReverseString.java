package task1;
import java.util.Scanner;
public class ReverseString {
	Scanner input = new Scanner(System.in);
	void method1() {
		System.out.println("Enter a string:");
		String sampleString = input.nextLine();
		StringBuilder result = new StringBuilder("");
		int stringLength = sampleString.length();
		for(int i=0;i<sampleString.length();i++,stringLength--) {
			char value=sampleString.charAt(stringLength-1);
			result = result.append(value);
		}
		System.out.println(result);
	}
	void method2() {
		System.out.println("Enter a string:");
		StringBuilder result = new StringBuilder(input.nextLine());
		result.reverse();
		System.out.println(result);
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		rs.method1();
		rs.method2();
	}
}
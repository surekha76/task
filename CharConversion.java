package task1;
import java.util.Scanner;
import java.util.ArrayList;
public class CharConversion {
	Scanner input = new Scanner(System.in);
	void method1() {
		System.out.println("Enter the string to change uppercase to lowercase:");
		String sampleString= input.nextLine();
		StringBuilder result=new StringBuilder("");
		char ch;
		for(int i:sampleString.toCharArray()) {
			if(i>=65 && i<=90) {
				int j = i+32;
				ch = (char)j;
				result.append(ch);
			}else {
				ch = (char)i;
				result.append(ch);
			}
		}
		System.out.println(result);
	}
	void method2() {
		System.out.println("Enter the string to change uppercase to lowercase using lowercase method:");
		String sampleString= input.nextLine();
		sampleString = sampleString.toLowerCase();
		System.out.println(sampleString);
	}
	void method3() {
		System.out.println("Enter the string to change alternative characters to uppercase:");
		String sampleString= input.nextLine();
		char[] ch = sampleString.toLowerCase().toCharArray();
	    boolean alternativeUpperCase = true;
	    System.out.println(ch.length);
	    for (int i=0; i<ch.length; i++) {
	        if(alternativeUpperCase && ch[i]!=' ') {
	        	ch[i] = Character.toUpperCase(ch[i]);
	            alternativeUpperCase = false;
	        } else if (!alternativeUpperCase) {
	        	alternativeUpperCase = true;
	        }
		}
	    String result = String.copyValueOf(ch);
	    System.out.println(result);
	}
	void method4() {
		System.out.println("Enter a string to change multiple of given number to character:");
		String sampleString = input.nextLine();
		System.out.println("Enter a number:");
		int num = input.nextInt();
		char[] ch = sampleString.toLowerCase().toCharArray();
		int j;
		for(int i=1; i<ch.length; i++) {
			j = num*i;
			if(j<ch.length) {
				ch[j] = Character.toUpperCase(ch[j]);
			}
		}
		String result = String.copyValueOf(ch);
	    System.out.println(result);
	}
	void method5() {
		 System.out.println("Enter a input:");
		 if(input.hasNextInt()) {
			 System.out.println("Given input is integer");
		 }else if(input.hasNextFloat()) {
			 System.out.println("Given input is float");
		 }else if(input.hasNext()) {
			 System.out.println("Given input is string");
		 }else if(input.hasNextLong()) {
			 System.out.println("Given input is Long");
		 }else if(input.hasNextDouble()) {
			 System.out.println("Given input is double");
		 }else if(input.hasNextBoolean()) {
			 System.out.println("Given input is boolean");
		 }
	}
	public static void main(String[] args) {
		CharConversion cc = new CharConversion();
		//cc.method1();
		//cc.method2();
		cc.method3();
		cc.method4();
		cc.method5();
	}
}
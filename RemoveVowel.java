package task1;
import java.util.Scanner;
public class RemoveVowel {
	Scanner input = new Scanner(System.in);
	void method1(){
		System.out.println("Enter a string:");
		String sampleString = input.nextLine();
		sampleString = sampleString.replaceAll("[aeiouAEIOU]", "");
		System.out.println(sampleString);
	}
	void method2() {
		System.out.println("Enter a string:");
		String sampleString = input.nextLine();
		char[] ch=sampleString.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			switch(ch[i]) {
			case 'a':
				sampleString = sampleString.replace("a", "");
				break;
			case 'e':
				sampleString = sampleString.replace("e", "");
				break;
			case 'i':
				sampleString = sampleString.replace("i", "");
				break;
			case 'o':
				sampleString = sampleString.replace("o", "");
				break;
			case 'u':
				sampleString = sampleString.replace("u", "");
				break;
			}
		}
		System.out.println(sampleString);
	}
	void method3() {
		System.out.println("Enter a string:");
		String sampleString = input.nextLine();
		StringBuilder result = new StringBuilder("");
		char[] ch=sampleString.toLowerCase().toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u') {
				result.append(ch[i]);
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		RemoveVowel rv= new RemoveVowel();
		rv.method1();
		rv.method2();
		rv.method3();
	}
}
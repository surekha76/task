package task1;
import java.util.Scanner;
public class UserDefinedExceptions {
	public static void main(String[] args) {
		Voter v = new Voter();
		System.out.println("Enter your age:");
		Scanner input = new Scanner(System.in);
        // String input
        int age = input.nextInt();
		try {
			v.checkAge(age);
			System.out.println("Valid age "+v.getAge()+ " Allowed to vote");
		}catch(InvalidAgeException e){
			System.out.println("Error: "+e);
		}
	}
}
class Voter {
	
	private int age;
	public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age. Minimum age required is 18.");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class InvalidAgeException extends Exception{ 
	public InvalidAgeException(String msg) {
		super(msg);
	}
 }
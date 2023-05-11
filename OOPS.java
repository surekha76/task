package task1;

class Person {
 private String name;
 private int age;
 private String gender;
 
 // Default constructor
 public Person() {
	 this.name = "Unknown";
	 this.age = 0;
	 this.gender = "-";
 }
 // Parameterized constructor for the Person class
 public Person(String name, int age, String gender) {
     this.name = name;
     this.age = age;
     this.gender = gender;
 }
 // Copy constructor
public Person(Person otherPerson) {
	this.name = otherPerson.name;
	this.age = otherPerson.age;
	this.gender = otherPerson.gender;
}
 
 // Getter methods
 public String getName() {
     return name;
 }
 
 public int getAge() {
     return age;
 }
 
 public String getGender() {
     return gender;
 }
 // print person details
 public void printDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Gender: " + gender);
 }
}
 

public class OOPS {
 public static void main(String[] args) {
	 // Object created for person
	 Person person1 = new Person();
     Person person2 = new Person("John", 30, "Male");
     Person person3 = new Person(person2);
     System.out.println("Person1 Details:");
     person1.printDetails();
     System.out.println();
     System.out.println("Person2 Details:");
     person2.printDetails();
     System.out.println();
     System.out.println("Person3 Details:");
     person3.printDetails();
     System.out.println();
 }
}

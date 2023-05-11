package task1;

import java.util.ArrayList;
import java.util.List;

//abstract class
abstract class Product {
	private final String category;
	private String name;
	private double price;

	public Product(String category, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public final String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	   this.name = name;
	}

	public double getPrice() {
	   return price;
	}
	
	public void setPrice(double price) {
	   this.price = price;
	}
	
	public abstract void displayDetails();
	
	public void finalize() {
		System.out.println("finalize method called"); 
	}
}

class Electronics extends Product {
	 private int warranty;

	 public Electronics(String name, double price, int warranty) {
	     super("Electronics", name, price);
	     this.warranty = warranty;
	 }

	 public int getWarranty() {
	     return warranty;
	 }

	 public void setWarranty(int warranty) {
	     this.warranty = warranty;
	 }

	 public void displayDetails() {
	     System.out.println("Name: " + getName());
	     System.out.println("Price: " + getPrice());
	     System.out.println("Category: " + getCategory());
	     System.out.println("Warranty: " + getWarranty() + " months");
	 }
}
 class Clothing extends Product {
	 private String size;

	 public Clothing(String name, double price, String size) {
	     super("Clothing", name, price);
	     this.size = size;
	 }

	 public String getSize() {
	     return size;
	 }

	 public void setSize(String size) {
	     this.size = size;
	 }

	 public void displayDetails() {
	     System.out.println("Name: " + getName());
	     System.out.println("Price: " + getPrice());
	     System.out.println("Category: " + getCategory());
	     System.out.println("Size: " + getSize());
	 }
}
class Book extends Product {
	 private String author;

	 public Book(String name, double price, String author) {
	     super("Book", name, price);
	     this.author = author;
	 }

	 public String getAuthor() {
	     return author;
	 }

	 public void setAuthor(String author) {
	     this.author = author;
	 }

	 public void displayDetails() {
	     System.out.println("Name: " + getName());
	     System.out.println("Price: " + getPrice());
	     System.out.println("Category: " + getCategory());
	     System.out.println("Author: " + getAuthor());
	 }
}

enum Category {
	 ELECTRONICS,
	 CLOTHING,
	 BOOK
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public synchronized void addProduct(Product product) {
    	products.add(product);
    }

    public synchronized void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayInventory() {
    	try {
    		 for (Product product : products) {
    	            product.displayDetails();
    	            System.out.println();
    	        }
    	}catch(Exception e) {
    		System.out.println("Exception error: "+e);
    	}
    	finally{
    		System.out.println("Finally block executed");
    	}
    }
}

public class Keywords {

	public static void main(String[] args) {
		 Inventory inventory = new Inventory();
		// inventory = null;
		 Electronics laptop = new Electronics("Dell Laptop", 600.0, 12);
		 inventory.addProduct(laptop);

		 Clothing shirt = new Clothing("Polo Shirt", 25.0, "Medium");
		 inventory.addProduct(shirt);

		 Book novel = new Book("To Kill a Mockingbird", 10.0, "Harper Lee");
		 inventory.addProduct(novel);

		 inventory.displayInventory();

		 inventory.removeProduct(laptop);
		 System.out.println("After removing the laptop:");
		 inventory.displayInventory();
		  Book book = new Book(null, 0, null);
		  System.out.println(book.hashCode());
		  book = null;
		  // Garbage collection
		  System.gc();
		}
}


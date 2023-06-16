package task1;
import java.util.*;
import java.util.Map.Entry;

public class List {

	public static void main(String[] args) {
		
		// Object creation for arrayList class
		ArrayListClass arrayListObj = new ArrayListClass();
		arrayListObj.listMethod();
		
		// Object creation for linkedList 
		LinkedListClass linkListObj = new LinkedListClass();
		linkListObj.linkListMethod();
		
		//Object creation for hashSet class
		HashSetClass hashSetObj = new HashSetClass();
		hashSetObj.hashSetMethod();
		
		// Object creation for linkedHashSet Class
		LinkedHashSetClass linkedHashSetObj = new LinkedHashSetClass();
		linkedHashSetObj.linkedHashSetMethod();
		
		// Object creation for vector class
		VectorClass vectorObj = new VectorClass();
		vectorObj.vectorMethod();
		
		// Object creation for map class
		
		MapClass mapObj = new MapClass();
		mapObj.hashMapMethod();
		mapObj.sortByKey();
	}
}
class ArrayListClass{
	Scanner input = new Scanner(System.in);
	public void listMethod(){
		int index;
		int value;
		ArrayList list= new ArrayList();
		System.out.println("Array list");
		list.add(10);
		list.add("surekha");
		list.add(10.9);
		for(int i=1; i<10; i++) {
			list.add(i);
		}
		System.out.println("Before add the value based on index: "+list);
		System.out.println("enter the index");
		index = input.nextInt();
		System.out.println("enter the value to add in arraylist");
		value = input.nextInt();
		list.add(index,value); // It will replace the index value with current value
		System.out.println("After add the value based on index: "+list);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
class LinkedListClass{
	public void linkListMethod() {
		System.out.println("LinkedList");
		LinkedList linklList = new LinkedList();
		linklList.add("john");
		linklList.add("zara");
		linklList.add("sam");
		linklList.add("tom");
		System.out.println("Before changing the list "+linklList);
		ListIterator listIterator = linklList.listIterator();
		while(listIterator.hasNext()) {
			String str = (String) listIterator.next();
			if (str.equals("sam")) {
				listIterator.remove(); //Remove the current element
			}else if (str.equals("tom")) {
				listIterator.set("roy"); //Replace the current element
				listIterator.add("cane"); //Add next element
			}
		}
		System.out.println("After changing the list "+linklList);
	}
}
class HashSetClass{
	public void hashSetMethod() {
		System.out.println("HashSet");
		HashSet set = new HashSet(); // create a new hashset
		set.add("A");
		set.add("B");
		set.add("C");
		set.add(null);
		set.add(10);
//		System.out.println(set);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Duplicate entry: "+set.add("A")); // If we add dulicate value it will return false
	}
}
class LinkedHashSetClass{
	public void linkedHashSetMethod() {
		System.out.println("LinkedHashSet object");
		LinkedHashSet linkedSet = new LinkedHashSet(); // create a new hashset with the capacity 16
		linkedSet.add("A");
		linkedSet.add("B");
		linkedSet.add("C");
		linkedSet.add(null);
		linkedSet.add(10);
//		System.out.println(linkedSet);
		Iterator iterator = linkedSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
class VectorClass{
	public void vectorMethod() {
		Vector v = new Vector();
		System.out.println("New vector created");
		System.out.println(v.capacity());
		for(int i=1; i<=11; i++) {
			v.add(i);
		}
		// Iterator cursor
		System.out.println("Iterator");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i%2==0) {
				itr.remove();
			}else {
				System.out.println(i);
			}
		}
		System.out.println("Vector variable after removing the even number: "+v);
	}
}
class MapClass{
	HashMap<Integer, String> hashMap = new HashMap<>();
	public void hashMapMethod() {
		System.out.println("Hash map method");
		
        // Add key-value pairs to the HashMap
        hashMap.put(2, "Apple");
        hashMap.put(5, "Banana");
        hashMap.put(7, "Orange");
        hashMap.put(1, "Grape");
        hashMap.put(32, "Mango");

        // Accessing values by key
        System.out.println("Value at key 3: " + hashMap.get(3));

        // Iterating over the HashMap
        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Checking if a key exists in the HashMap
        int keyToCheck = 2;
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist.");
        }

        // Removing a key-value pair from the HashMap
        int keyToRemove = 4;
        String removedValue = hashMap.remove(keyToRemove);
//        System.out.println("REmoved value: "+removedValue);
        if (removedValue != null) {
            System.out.println("Removed value: " + removedValue);
        } else {
            System.out.println("Key " + keyToRemove + " does not exist.");
        }

        // Clearing the HashMap
//        hashMap.clear();

        // Checking if the HashMap is empty
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }
	public void sortByKey() {
		System.out.println("sorting");
		TreeMap<Integer, String> sorted = new TreeMap<>(hashMap); // Convertion HashMap to TreeMap. Here TreeMap will sort the data in default sorting order
		System.out.println("Default sorting order: "+sorted);
		TreeMap<Integer, String> reverseSort = new TreeMap<Integer, String>(Collections.reverseOrder()); // ReverseOrder is a collection class to use the comparator
		reverseSort.putAll(hashMap);
		System.out.println("Reverse order: "+reverseSort);
		// Iterating over the reverse sort treeMap
		for (Entry<Integer, String>entry : reverseSort.entrySet()) {
			System.out.println("[" + entry.getKey()+ ", " + entry.getValue() + "]");
		}
	}
}

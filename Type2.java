import java.util.ArrayList;
import java.util.HashMap;

public class Type2 {

	public static void main(String[] args) {
		//Type2 - Array, List, Map
		
		//Array - Array has fixed length and is in order, All of the elements are of the same type
		int [] array = {1,2,3,4,5};
		System.out.println(array.length); //5
		System.out.println(array[0]); //1
		System.out.println(array[1]); //2
		
		/*
		List - List has flexible length and is in order, Different types of elements are possible
		=> Using Generics: Define and match element types
		List is composed of ArrayList, Linked List etc.
		=> List - Interface, ArrayList - Class 
		So, Using ArrayList or LinkedList is Easy
		Using List is More types available
		*/
		
		ArrayList al = new ArrayList();
		al.add("123");
		al.add("456");
		al.add("789");
		al.add(3);
		System.out.println(al.get(3)); //3
		//List has an order, so we can access elements by index
		System.out.println(al.size()); //4
		System.out.println(al.remove("123")); //true
		System.out.println(al.remove("123")); //false
		System.out.println(al.remove(0)); //456
		/*
		remove(x) x = Element or Index
		Element - Return True or Flase
		Index - Return Value
		*/
		System.out.println(al);//[789,3]
		
		//Generics
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("123");
		//al2.add(3); -> Error Because of <String> means All elements must be String
		
		/*
		Map - Map has flexible length and is not in order, All of the elements are of the same type
		=> Not in order: Using Key and Value
		List is composed of HashMap, Tree Map etc.
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		/*
		Map has no order and uses Key.
		Therefore, when defining a map, 
		the value of the key value should be defined using generics.
		 */
		hm.put("example1","Hello");
		hm.put("example2","World");
		hm.put("example3","!!!");
		System.out.println(hm.get("example1"));
		//Map has not an order, so we can access elements by Key
		System.out.println(hm.containsKey("example1"));
		//Find Key => Return: True, Flase
		System.out.println(hm.remove("example1"));
		System.out.println(hm.remove("World"));
		System.out.println(hm); // {example3=!!!, example2=World}
		//remove must using Key and Result is not an order
		System.out.println(hm.size()); //2
	}

}

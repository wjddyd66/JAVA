
public class AccessController_Class_Method {
	/*
	 AccessController - Means to divide the access range 
	 according to the member to protect the logic of the object
	 private < default < protected < public : Availity of allow more member access
	 */
	
	//Private - Access only from the Class
	private int a = 3;
	
	//Public - Variables and methods with public access control can be accessed from any Class
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
		/*
		 this. is used to make sure that the global field is the instance field 
		 when the parameters of the method or constructor are the same.
		 =>Increase recyclability by continuing to use variables of the same name
		 */
	}
	
	/*
	 Encapsulation - To access the private variable, 
	 access the method as public and execute the operation on the variable.
	 Advantage: Encryption, Automation
	 */
	
	public String Hello(String s) {
		return "World" +a;
	}
	/*
 	Method - The input will result in a logic overflow = Function
	 Once declared, you can get results based on Input from multiple armies. 
	 => High recyclability
	 How to make Method?
	 public => Access Controller Type
	 String => Output Type
	 Hello => Method Name
	 String s => Input Type
	 return "World" + a => Output Value
	 */
	
	 public String Hello() {
		 return "Hello World";
	 }
	 /*
	  OverLoading -You can define multiple methods with the same name.
	  How to use OverLoading?
	  1) Input type is different.
	  2) The number of input values ​​is different.
	  */
	 
	 String s= Hello();
	 String s2= Hello("Hello");
	 /*
	  The overloading method searches the method 
	  according to the input type or number of inputs.
	  */
	 
	/*
	 Protected - It can be accessed from a class in the same package 
	 or from an external package class that inherits the class.
	 */
	protected int a2 = 3;
	
	public AccessController_Class_Method() {
		/*
		Default - It is accessible only within the package.
		Set access controller X => default
		 */
		int a =3;
		System.out.println("Create a constructor");
		System.out.println(a);
	}
	/*
	 Constructor - When creating an object, first execute 
	 (system = JVM call): Initialization
	 The constructor must be present.
	 However, if you do not have a star, the compiler does it for you.
	 How to make?
	 1) The class name and method name are the same
	 2) Do not define the return type
	 */
	
	public static void main(String[] args) {
		/*
		 Class is declared only.
		 You can create objects using classes.
		 The advantage of an object is that it is highly recyclable 
		 (once you declare a class, you can continue to call it).
		 Java is called an object-oriented language 
		 because most things are made up of objects
		 */
		AccessController_Class_Method A_ins = new AccessController_Class_Method();
		AccessController_Class_Method A_ins2 = new AccessController_Class_Method();
		/*
		 AccessControllerAndClass - Class
		 A_ins, A_ins2 - Object
		 */
		A_ins.a = 5;
		A_ins2.a = 8;
		System.out.println(A_ins.a+" "+A_ins2.a);
		/*
		 Result: 5 8
		 Variables assigned to an object in a class are called "object variables" 
		 and values ​​of different objects are not shared.
		 */
		
	}
}

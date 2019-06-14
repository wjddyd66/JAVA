
public class Sonata {

	private int a = 3;
	//Public - Variables and methods with public access control can be accessed from any Class
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
		/*
		 this. is used to make sure that the global field is 	  the instance field 
		 when the parameters of the method or constructor are    	  the same.
		 =>Increase recyclability by continuing to use 		  	   variables of the same name
		 */
	}

	/*
	 Encapsulation - To access the private variable, 
	 access the method as public and execute the operation on the variable.
	 Advantage: Encryption, Automation
	 */
	
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.name);
		//car
	}

}

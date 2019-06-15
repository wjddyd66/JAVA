
public class Type {

	public static void main(String[] args) {

		//Type
		//Data Type - Number, Boolean, Character, String
		
		//Number - Integer, Real
		
		//Integer - byte, short, int, long	
		byte i1 = 1; // Memory Size: 1Byte, Range: -128 ~ 127
		short i2 = 2; // Memory Size: 2Byte, Range: -32768 ~ 32767
		int i3 = 3; // Memory Size: 4Byte, Range: -2147483648 ~ 2147483647
		long i4 = 4; // Memory Size: 8Byte, Range: -922337036854775808 ~ 9223372036854775807
		
		//Real - float, double
		float r1 = 3.14F; // Memory Size: 4Byte, Range: 1.40239846E-45f ~ 3.40282347E+38f
		//In Java, float type must be add number+F 
		double r2 = 3.2; // Memory Size: 8Byte, Range: 4.94065645841246544E-324 ~ 1.79769313486231570E+308
		
		//Numeric Operation - +, -, *, /, %, Increase / Decrease operation
		System.out.println(i4+i3);
		System.out.println(i4-i3);
		System.out.println(i4*i3);
		System.out.println(i4/i3);
		System.out.println(i4%i3);
		//Result: 7 1 12 1 1
		// / = Share, % = Reminder
		
		//Increase / Decrease Operation - i++, ++i, i--, --i
		int i = 3;
		System.out.print(++i);
		System.out.print(i++);
		System.out.print(i);
		System.out.print(--i);
		System.out.print(i--);
		System.out.println(i);
		/* Result: 4 4 5 4 4 3
		++ i is calculated before the operation
		i ++ computes after computation */
		
		//Boolean
		boolean b1 = false;
		boolean b2 = true;
		//The Boolean type has only True False
		//Much use in conditional statements
		System.out.print(b1 && b1);
		System.out.print(b2 && b2);
		System.out.print(b1 && b2);
		System.out.print(b1 || b1);
		System.out.print(b2 || b2);
		System.out.println(b1 || b2);
		/* Result: false true false false true true
		  false = 0, true =1
		  && = +, || = *
		 */
		 
		//Character - Char
		char c1 = 'A'; //Memory Size: 1Byte, Range: \u0000 ~ \uFFFF
		
		//String
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		//Because String is an object, you can use the built-in method.
		System.out.println(s1.contentEquals(s2)); //True
		System.out.println(s1.indexOf('W')); //6
		System.out.println(s1.replaceAll("Hello", "World")); //World World
		System.out.println(s1.substring(0,4)); // Hell
		System.out.println(s1.toUpperCase()); // HELLO WORLD
		
		//String - More Details: String Buffer
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append("World");
		String s3 = "Hello";
		s3=s3+"World";
		System.out.println(s3.contentEquals(sb.toString())); //True
		//String Buffer object is created only once
		//String object is created whenever + operation
		//Once String object created, cannot modified and heavy
		//So encouraging use StringBuffer
		
	}

}

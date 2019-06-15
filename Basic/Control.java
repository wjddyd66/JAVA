
public class Control {

	public static void main(String[] args) {
		/* 
		Control - if, switch/case, while, for, for each
		if - used to cast initial conditions
		else if - used to specify a condition after one if statement
		else - Use to set other conditions of if, else if
		
		Comparison operator - Operators used to compare conditions
		=> <, >, ==, !=, >=, <=
		=: Assign a value
		==: Compare values to each other
		 */
		int a =3;
		if(a<1) {
			System.out.println("a < 1");
		}
		else if(a<2) {
			System.out.println("1 <= a < 2");
		}
		else {
			System.out.println("2 <= a");
		}
		//2 <= a
		
		/*
		Additional operators - used to cast multiple conditions
		and(&&), or(||), not(!)
		 */
		int b =3;
		int c = 4;
		if(b ==3 || c ==1) {
			System.out.println(b+c);
		}
		else {
			System.out.println(b-c);
		}
		//7
		
		/*
		 Switch/Case - The statement is the same as the if statement, 
		 but is used for readability.
		 */
		int month = 3;
		String result = "";
		switch(month) {
		case 1: result = "J";
				break;
		case 2: result = "F";
				break;
		case 3: result = "M";
				break;
		case 4: result = "A";
				break;
		default: result = "NaN";
				break;
		}
		System.out.println(result);
		//M
		//case 1: result ="J" => if month == 1 result="J"
		//break => end the syntax enclosed by {}.
		//case 2: result ="F" => else if month == 2 result="F"
		//...
		//default => else
		
		/*
		While - The while loop repeats while the condition in () is satisfied
		Use the for statement a lot, but use infinite loop for while
		 */
		int d = 1;
		while(d<10) {
			System.out.print(d);
			d++;
		}
		//123456789
		
		System.out.println();
		
		while(true) {
			System.out.print(d);
			if(d>15)
				break;
			else if(d>13) {
				d=d+2;
				continue;
			}
			d++;
		}
		//10 11 12 13 14 16
		//while(true) -> Infinite loop So you must make an escape condition with Break
		//continue - Execute the While statement again without executing the following syntax
	
		/*
		 for - Popular Loop for(Initial Value; Conditional Statements; Increment)
		 */
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+" = "+i*j+" ");
			}
			System.out.println();
		}
		//Multiplication Table
		
		/*
		 Etc - A convenient For syntax 
		 when you need to get the value of an array and use it
		 Repeat for the number of items in the array
		 Assign the value of the array to a variable that is declared automatically
		 */
		int array[] = {1,2,3,4,5};
		for (int number: array)
			System.out.print(number);
		//12345
	}
}


public class CallByValue_CallByReference {
	String s;
	
	public CallByValue_CallByReference(String s) {
		this.s=s;
	}
	
	public static void main(String[] args) {
		//Call By Value 의 예제이다
		String s1 = "Hello";
		String s2 = "World";
		ValueSwap(s1, s2);
		System.out.println(s1+s2);
		/*
		WorldHello
		HelloWorld
		결과에서 보았듯이 주소가 아닌 값을 참조하여 s1과 s2가 Swap되지 않는 결과를 보인다.
		*/
		CallByValue_CallByReference ss1 
		= new CallByValue_CallByReference("Hello");
		
		CallByValue_CallByReference ss2 
		= new CallByValue_CallByReference("World");
		ReferenceSwap(ss1,ss2);
		System.out.println(ss1.s+ss2.s);
		/*
		WorldHello
		WorldHello
		객체의 값을 바꾼 것 이기 때문에 값이 Swap되었다.
		하지만 Call By Reference는 아니고 Call By Value로서
		Call By Reference처럼 흉내를 낸 것이다.
		*/
	}
	
	//Call By Value Method
	static void ValueSwap(String one, String two) {
		String temp = one;
		one = two;
		two = temp;
		System.out.println(one+two);
	}
	
	//Call By Reference같은 Method
	static void ReferenceSwap(CallByValue_CallByReference ss1, CallByValue_CallByReference ss2) {
		String temp =ss1.s;
		ss1.s =ss2.s;
		ss2.s =temp;
		System.out.println(ss1.s+ss2.s);
	}

}

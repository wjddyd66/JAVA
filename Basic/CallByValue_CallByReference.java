
public class CallByValue_CallByReference {
	String s;
	
	public CallByValue_CallByReference(String s) {
		this.s=s;
	}
	
	public static void main(String[] args) {
		//Call By Value �� �����̴�
		String s1 = "Hello";
		String s2 = "World";
		ValueSwap(s1, s2);
		System.out.println(s1+s2);
		/*
		WorldHello
		HelloWorld
		������� ���ҵ��� �ּҰ� �ƴ� ���� �����Ͽ� s1�� s2�� Swap���� �ʴ� ����� ���δ�.
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
		��ü�� ���� �ٲ� �� �̱� ������ ���� Swap�Ǿ���.
		������ Call By Reference�� �ƴϰ� Call By Value�μ�
		Call By Referenceó�� �䳻�� �� ���̴�.
		*/
	}
	
	//Call By Value Method
	static void ValueSwap(String one, String two) {
		String temp = one;
		one = two;
		two = temp;
		System.out.println(one+two);
	}
	
	//Call By Reference���� Method
	static void ReferenceSwap(CallByValue_CallByReference ss1, CallByValue_CallByReference ss2) {
		String temp =ss1.s;
		ss1.s =ss2.s;
		ss2.s =temp;
		System.out.println(ss1.s+ss2.s);
	}

}

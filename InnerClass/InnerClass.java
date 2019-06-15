package InnerClass;

/*
TestInnerClass.java
OuterClass - TestInnerClass
InnerClass - Inner
����Ŭ����: �ڵ��� ���⼺�� �������� ���̱� ���Ͽ� ����Ѵ�.
�ܺ�Ŭ������ ����� ���� ���� �����ϴٴ� ������ ������ �ִ�.
*/
public class InnerClass {
	
	//Outer Class�� Value
	String outer_value ="Hello";
	
	//Outer Class�� Method
	public void outMethod() {
		System.out.println("OuterMethod");
	}
	
	//Inner Class ����
	public class Inner{
		//Inner Class�� Value
		String inner_value ="World";
		//Inner Class�� Method
		public void innerMethdod() {
			System.out.println("InnerMethod");
		}
	}
	
	public static void main(String[] args) {
		//OuterClass ���� �� ��üȭ
		InnerClass outer = new InnerClass();
		//InnerClass�� OuterClass.new InnerClass()�μ� ��üȭ �Ͽ� ���
		Inner inner = outer.new Inner();
		
		outer.outMethod();
		inner.innerMethdod();
		System.out.println(outer.outer_value+inner.inner_value);
		/*
		OuterMethod
		InnerMethod
		HelloWorld
		 */
	}
}

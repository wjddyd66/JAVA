package InnerClass;

/*
TestInnerClass.java
OuterClass - TestInnerClass
InnerClass - Inner
내부클래스: 코드의 복잡성과 가독성을 높이기 위하여 사용한다.
외부클래스의 멤버에 쉽게 접근 가능하다는 장점을 가지고 있다.
*/
public class InnerClass {
	
	//Outer Class의 Value
	String outer_value ="Hello";
	
	//Outer Class의 Method
	public void outMethod() {
		System.out.println("OuterMethod");
	}
	
	//Inner Class 선언
	public class Inner{
		//Inner Class의 Value
		String inner_value ="World";
		//Inner Class의 Method
		public void innerMethdod() {
			System.out.println("InnerMethod");
		}
	}
	
	public static void main(String[] args) {
		//OuterClass 선언 및 객체화
		InnerClass outer = new InnerClass();
		//InnerClass는 OuterClass.new InnerClass()로서 객체화 하여 사용
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

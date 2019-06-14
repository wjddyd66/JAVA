package Inheritance;

//Format: 자식클래스 extends 부모클래스로 자식이라는 것을 표현
public class Child extends Parent{
	String name;
	
	/*Annotaion: AOP를 편리하게 구성하기 위하여 사용
	@Override: 메소드가 오버라이드 됬는지 검증
	Overriding: 부모에서 정의한 것을 자식 Class에서 내용을 변경해야 할 상황이
	올때 사용할 수 있다.
	*/
	@Override
	public void setName(String name,int name2) {
		this.name = name;
	}
	
	//자식 클래스는 부모클래스에 선언된 것을 사용할 수 있다.
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child();
		
		//부모 클래스에 public으로 선언된 set,get Method에 접근 가능하다.
		c1.setName("Tom");
		c2.setName("James");
		c1.getName();
		c2.getName();
		
		Parent p1 = new Child();
		/*부모는 자식으로서 선언 가능하다.
		Child c3 = new Parent();
		Error => 자식은 부모로서 선언 불 가능하다.
		자식에서 Overriding으로 더 선언 되어 있을 수 있기 때문이다.
		*/
		
	}

}

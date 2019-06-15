package Abstract;

public class Abstract {
	
	public static void main(String[] args) {
		/*
		Parent p1 = new Parent(); 
		추상 클래스는 바로 객체화 할 수 없다.
		추상 Method가 정의되어 있지 않기 때문이다.
		따라서 추상 클래스는 자식 클래스에서 추상 Method를 선언한 뒤
		객체화 하여 사용하여야 한다.
		*/
		Child c1 = new Child();
		Child2 c2 = new Child2();
		System.out.println(c1.getName());
		c1.func();
		System.out.println(c2.getName());
		c2.func();
		/*
		Hwang
		추상화 Class 의 추상 Method Override
		Child1은 일반 Method가 Override O => 재정의한 내용 출력
		Kim
		추상화 Class 의 추상 Method Override
		Child1은 일반 Method가 Override X => 부모 Class의 내용 출력
		*/
	}
}

package Abstract;

public class Child2 extends Parent{
	
	//추상 Method만 정의하고 나머지는 그대로 상속받은 Method를 사용하겠다는 뜻이다.
	@Override
	void func() {
		System.out.println("추상화 Class 의 추상 Method Override");
	}

}

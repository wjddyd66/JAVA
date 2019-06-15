package Abstract;


//추상 클래스를 extends한 자식 클래스이다.
//extends이므로 다중 상속 불가
public class Child extends Parent{
	String name = "Hwang";
	
	/*
	추상 클래스의 일반 Method도 Override할 수 있다.
	Override하여 재정의 하거나 그대로 상속받은 대로 사용할 수 있다.
	super: 자식 클래스에서 상속받은 부매 클래스의 멤버 변수를 참조할 때 사용 
	*/
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public String getName() {
		super.setName(this.name);
		return super.getName();
	}
	
	//추상 Method는 정의하지 않으면 Error가 발생하게 된다.
	@Override
	void func() {
		System.out.println("추상화 Class 의 추상 Method Override");
	}

}

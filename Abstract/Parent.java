package Abstract;

/*
추상클래스 선언
Format: abstract class Class-Name
추상클래스란 추상 메소드를 포함하는 클래스 이다.
*/
abstract class Parent {
	String name="Kim";
	
	//Interface와 다르게 Method의 내용을 정의할 수 있다.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//추상 메소드 이다. 추상메소드는 Interface와 같이 선언만 한다.
	abstract void func();
	
}

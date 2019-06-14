package Inheritance;

//부모 선언
public class Parent {
	private String name;
	
	/*
	오버로딩(Overloading): 같은 클래스 내 에서 같은 이름의 Method를 사용하는 것 이다.
	1. Argument 의 개수가 다르다.
	2. Argument 의 Type이 다르다.
	=> 목적이 같은 Method이나 Type이나 개수에 따라서 달라지는 Method를 선언할 때 적합
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String name,String name2) {
		this.name = name;
	}
	
	public void setName(String name,int name2) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

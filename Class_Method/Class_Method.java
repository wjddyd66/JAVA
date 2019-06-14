
public class Class_Method {
	//private 변수 선언
	private int a=3;
	
	//private 변수에 접근하기 위하여 Getter public Method 선언
	public int getA() {
		return a;
	}
	
	//생성자로서 객체가 생성 될때 초기 조건을 주어줄 수 있다.
	public Class_Method() {
		System.out.println("생성자 생성 완료");
		this.a =4;
	}

	/*
	Method 선언으로서 
	public => Access Modifier
	int => return Type
	abc => Class 이름 
	int a => input Type
	*/
	public int abc(int a) {
		return a;
	}
	
}

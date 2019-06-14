package Interface;

/*
Interface를 상속받는 경우는 implements로서 상속받게 된다.
Interface의 장점은 다중 상속이 가능하다.
 */
public class Child implements Parent,Parent2{
	String name;
	
	public static void main(String[] args) {
		System.out.println("Interface");
		//Parent.name="Hwang" Parent에서 Final로 정의되어있어 값을 변경 할 수 없다.
		System.out.println(Parent.name);
		//Interface, Kim

	}
	
	
	//Interface에서 정의한 Method는 반드시 Child Class에서 정의하여야 한다.
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

}

package Interface;

/*
Interface�� ��ӹ޴� ���� implements�μ� ��ӹް� �ȴ�.
Interface�� ������ ���� ����� �����ϴ�.
 */
public class Child implements Parent,Parent2{
	String name;
	
	public static void main(String[] args) {
		System.out.println("Interface");
		//Parent.name="Hwang" Parent���� Final�� ���ǵǾ��־� ���� ���� �� �� ����.
		System.out.println(Parent.name);
		//Interface, Kim

	}
	
	
	//Interface���� ������ Method�� �ݵ�� Child Class���� �����Ͽ��� �Ѵ�.
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

}

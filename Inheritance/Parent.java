package Inheritance;

//�θ� ����
public class Parent {
	private String name;
	
	/*
	�����ε�(Overloading): ���� Ŭ���� �� ���� ���� �̸��� Method�� ����ϴ� �� �̴�.
	1. Argument �� ������ �ٸ���.
	2. Argument �� Type�� �ٸ���.
	=> ������ ���� Method�̳� Type�̳� ������ ���� �޶����� Method�� ������ �� ����
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

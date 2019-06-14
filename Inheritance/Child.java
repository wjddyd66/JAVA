package Inheritance;

//Format: �ڽ�Ŭ���� extends �θ�Ŭ������ �ڽ��̶�� ���� ǥ��
public class Child extends Parent{
	String name;
	
	/*Annotaion: AOP�� ���ϰ� �����ϱ� ���Ͽ� ���
	@Override: �޼ҵ尡 �������̵� ����� ����
	Overriding: �θ𿡼� ������ ���� �ڽ� Class���� ������ �����ؾ� �� ��Ȳ��
	�ö� ����� �� �ִ�.
	*/
	@Override
	public void setName(String name,int name2) {
		this.name = name;
	}
	
	//�ڽ� Ŭ������ �θ�Ŭ������ ����� ���� ����� �� �ִ�.
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child();
		
		//�θ� Ŭ������ public���� ����� set,get Method�� ���� �����ϴ�.
		c1.setName("Tom");
		c2.setName("James");
		c1.getName();
		c2.getName();
		
		Parent p1 = new Child();
		/*�θ�� �ڽ����μ� ���� �����ϴ�.
		Child c3 = new Parent();
		Error => �ڽ��� �θ�μ� ���� �� �����ϴ�.
		�ڽĿ��� Overriding���� �� ���� �Ǿ� ���� �� �ֱ� �����̴�.
		*/
		
	}

}

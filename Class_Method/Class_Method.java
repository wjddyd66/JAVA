
public class Class_Method {
	//private ���� ����
	private int a=3;
	
	//private ������ �����ϱ� ���Ͽ� Getter public Method ����
	public int getA() {
		return a;
	}
	
	//�����ڷμ� ��ü�� ���� �ɶ� �ʱ� ������ �־��� �� �ִ�.
	public Class_Method() {
		System.out.println("������ ���� �Ϸ�");
		this.a =4;
	}

	/*
	Method �������μ� 
	public => Access Modifier
	int => return Type
	abc => Class �̸� 
	int a => input Type
	*/
	public int abc(int a) {
		return a;
	}
	
}

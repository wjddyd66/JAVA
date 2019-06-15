package Abstract;


//�߻� Ŭ������ extends�� �ڽ� Ŭ�����̴�.
//extends�̹Ƿ� ���� ��� �Ұ�
public class Child extends Parent{
	String name = "Hwang";
	
	/*
	�߻� Ŭ������ �Ϲ� Method�� Override�� �� �ִ�.
	Override�Ͽ� ������ �ϰų� �״�� ��ӹ��� ��� ����� �� �ִ�.
	super: �ڽ� Ŭ�������� ��ӹ��� �θ� Ŭ������ ��� ������ ������ �� ��� 
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
	
	//�߻� Method�� �������� ������ Error�� �߻��ϰ� �ȴ�.
	@Override
	void func() {
		System.out.println("�߻�ȭ Class �� �߻� Method Override");
	}

}

package Abstract;

/*
�߻�Ŭ���� ����
Format: abstract class Class-Name
�߻�Ŭ������ �߻� �޼ҵ带 �����ϴ� Ŭ���� �̴�.
*/
abstract class Parent {
	String name="Kim";
	
	//Interface�� �ٸ��� Method�� ������ ������ �� �ִ�.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//�߻� �޼ҵ� �̴�. �߻�޼ҵ�� Interface�� ���� ���� �Ѵ�.
	abstract void func();
	
}

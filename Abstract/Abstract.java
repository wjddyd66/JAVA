package Abstract;

public class Abstract {
	
	public static void main(String[] args) {
		/*
		Parent p1 = new Parent(); 
		�߻� Ŭ������ �ٷ� ��üȭ �� �� ����.
		�߻� Method�� ���ǵǾ� ���� �ʱ� �����̴�.
		���� �߻� Ŭ������ �ڽ� Ŭ�������� �߻� Method�� ������ ��
		��üȭ �Ͽ� ����Ͽ��� �Ѵ�.
		*/
		Child c1 = new Child();
		Child2 c2 = new Child2();
		System.out.println(c1.getName());
		c1.func();
		System.out.println(c2.getName());
		c2.func();
		/*
		Hwang
		�߻�ȭ Class �� �߻� Method Override
		Child1�� �Ϲ� Method�� Override O => �������� ���� ���
		Kim
		�߻�ȭ Class �� �߻� Method Override
		Child1�� �Ϲ� Method�� Override X => �θ� Class�� ���� ���
		*/
	}
}

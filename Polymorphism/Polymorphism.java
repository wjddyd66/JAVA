package Polymorphism;

//Polymorphism ����
public class Polymorphism {
	public static void main(String[] args) {
		Car c1 = new Grenger();
		Car c2 = new Sonata();
		c1.name();
		c1.price();
		c2.name();
		c2.price();
		/*
		Car ��� ������ Type�� ��������
		Car�� �ڽ� �� �ٸ� Sonata �� Grenger�� ����Ͽ�
		Grenger 8000 Sonata 4000��� �ٸ� ����� ���´�
		 */
	}
}

package Polymorphism;

//Polymorphism 예제
public class Polymorphism {
	public static void main(String[] args) {
		Car c1 = new Grenger();
		Car c2 = new Sonata();
		c1.name();
		c1.price();
		c2.name();
		c2.price();
		/*
		Car 라는 동일한 Type을 가지지만
		Car의 자식 중 다른 Sonata 와 Grenger를 사용하여
		Grenger 8000 Sonata 4000라는 다른 결과가 나온다
		 */
	}
}

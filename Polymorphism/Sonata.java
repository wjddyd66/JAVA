package Polymorphism;

//Sonata Class Á¤ÀÇ
public class Sonata implements Car{
	
	//Car Method Override
	@Override
	public void name() {
		System.out.println("Sonata");
	}
	
	@Override
	public void price() {
		System.out.println("4000");
		
	}

}

package Polymorphism;

//Grenger Class ����
public class Grenger implements Car{
	
	//Car Method Override
	@Override
	public void name() {
		System.out.println("Grenger");
	}
	
	@Override
	public void price() {
		System.out.println("8000");
		
	}

}

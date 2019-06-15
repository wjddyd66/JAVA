package InnerClass;

public class AnonymousClass {

	public static void main(String[] args) {
		Person Hwang = new Person() {
			@Override
			public void Name() {
				System.out.println("È²Á¤¿ë");	
			}
			@Override
			public void Age() {
				System.out.println("26");	
			}
		};
		Hwang.Name();
		Hwang.Age();
	}

}

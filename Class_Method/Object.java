
public class Object {

	public static void main(String[] args) {
		//앞에서 선언한 Object 선언
		Class_Method object = new Class_Method();
		System.out.println(object.abc(3));
		System.out.println(object.getA());
		/*3 4
		Object 가 생성되면서 Constructor 실행
		System.out.println("생성자 생성 완료");
		this.a =4;
		가 실행되므로 private 변수 a가 4로 값이 변하게 되었다.
		*/
	}

}

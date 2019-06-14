package Interface;

public interface Parent {
	/*
	Interface 에서 변수선언은 final 로서 변하지 않게 선언해 주어야 한다.
	final 로 선언하게 되면 값이 변하지 않는 특성을 가지게 된다.
	*/
	public final String name="Kim";
	
	//자바에서 Method는 내용을 선언하지 않고 선언만 해준다.
	public void setName(String name);
	public String getName();
}

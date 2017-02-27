package work;

@SomeAnnotation
public class Caller {

	@SomeAnnotation
	public static void caller(){
		System.out.println(new Callee().callee());
	}
}

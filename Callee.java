package work;

import java.lang.reflect.Method;

public class Callee {

	public String callee(){
		
		String className = Thread.currentThread().getStackTrace()[2].getClassName();
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		try {
			Class<?> klass = Class.forName(className);
			Method method = klass.getMethod(methodName);
			
			if(klass.isAnnotationPresent(SomeAnnotation.class))
				System.out.println("HELLO");
			
			if(method.isAnnotationPresent(SomeAnnotation.class))
				System.out.println("HELLOW");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

package typeinfo.exercise25b;

import java.lang.reflect.Method;

import typeinfo.exercise25a.TypeinfoEx25Class;

public class TypeinfoEx25 {
	public static void main(String[] args) throws Exception {
		TypeinfoEx25Class test = new TypeinfoEx25Class();
		callMethod(test, "firstMethod");
		callMethod(test, "secondMethod");
		callMethod(test, "thirdMethod");
	}
	
	public static void callMethod(Object a, String methodName) throws Exception {
		Method m = a.getClass().getDeclaredMethod(methodName);
		m.setAccessible(true);
		m.invoke(a);
	}
}

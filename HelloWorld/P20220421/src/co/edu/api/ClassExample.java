package co.edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {

	public static void main(String[] args) {

		try {
		   //리턴되는 타입 Class
			Class cls = Class.forName("java.lang.String");
			Method[] methods = cls.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method.getName());	//Class에 String인 정보를 가져온다
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class obj = ObjectExample.class;
		Constructor[] cons = obj.getDeclaredConstructors();
		for(Constructor construct : cons) {
			System.out.println(construct.getName());	//
		}
		
	}

}

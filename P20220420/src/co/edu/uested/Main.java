package co.edu.uested;

import co.edu.uested.Outer.Inner2;

public class Main {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.method1();
		
		//인스턴스 멤버클래스
		Outer.Inner1 inner = outer.new Inner1();	//클래스 안에 클래스가 들어가서 Outer.Inner
		inner.method2();
		
		
		//static(정적) 멤버클래스
		Outer.Inner2.method5();	//인스턴스를 안 만들어도 됨 
		//static 클래스의 인스턴스 메소드 호출하기
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4();	//인스턴스 메소드
		inner2.method5();	//정적 메소드
		
	}

}

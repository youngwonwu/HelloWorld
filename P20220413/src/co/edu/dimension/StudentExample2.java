package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
//		System.out.println("학생이름 점수 나이");	
//		
//		System.out.print(scn.next());
//		System.out.print(scn.next());
//		System.out.print(scn.next());
		
		Student s1 = new Student();
		
		System.out.println("학생이름 점수 나이");
		s1.studName = scn.next();
		s1.score = Integer.parseInt(scn.next());	//1 != "1"
		s1.age = Integer.parseInt(scn.next());
		
		Student[] students = {new Student(), new Student(), new Student()};
		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());
		students[0].age = Integer.parseInt(scn.next());
		
		//조회하고 싶은 이름 입력
		//해당이름 홍길동은 ??살이고 ??점입니다.
		
	}
}

package co.edu.dimension;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		// 학생이름, 점수 => names, scores
		Student s1 = new Student();	//학생이름, 점수
		s1.studName = "홍길동";
		s1.score = 80;
		s1.age = 20;
		
		Student s2 = new Student();
		s2.studName = "김길동";
		s2.score = 75;
		s2.age = 22;
		
		Student s3 = new Student();
		s3.studName = "박길동";
		s3.score = 82;
		s3.age = 24;
		
		Student[] students = {s1, s2, s3};		
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("학생이름 입력>> ");
//		String searchName = scn.nextLine();
//		
//		for(int i=0; i<students.length; i++) {
//			if(students[i].studName.equals(searchName)) {
//				System.out.println(students[i].score);
//			}
//		}
		
		int seachAge = 23;	//seachAge보다 나이가 더 많은 사람 가져 올려고
		
		for(int i=0; i<students.length; i++) {
			if(students[i].age > seachAge) {
				System.out.println(students[i].age);
			}
		}
		
		System.out.println("end of program");
		
	}

}

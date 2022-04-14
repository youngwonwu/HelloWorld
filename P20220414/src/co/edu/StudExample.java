package co.edu;

public class StudExample {

	public static void main(String[] args) {

		Student stud1 = new Student();	//인스턴스 할당
		stud1.name = "홍길동";	//필드에 값을 저장
		stud1.studNO = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "우동이";
		stud2.studNO = "22-3456789";
		stud2.age = 4;
		stud2.height = 20.3;
		
		Student stud3 = new Student();	//기본 생성자
		
		Student stud4 = new Student("이름 없음", "22-3459872");
		stud4.age= 50;
		stud4.height = 195.3;
		
		Student stud5 = new Student("이름 없음2", "22-3243872", 40);	//생성자의 이름, 학번, 나이 매개값을 출력해준다
		
		Student stud6 = new Student("이름3", "33-23445645", 38, 234.5);
		
		
		stud1.study();
		stud2.study();
		
		stud1.showInfo();
		stud3.showInfo();	//값이 없어 초기값을 보여줌
		stud4.showInfo();
		stud5.showInfo();
		stud6.showInfo();
	}

}

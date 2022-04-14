package co.edu;

public class Student {
	//필드(추상화)
	String name;
	String studNO;
	int age;
	double height;
	
	//생성자	=> 인스턴스를 만들어줄때 처리할 기능정의
	//매개값이 없는 생성자를 기본생성자
	//필드에 초기값을 설정할때 많이 쓴다
	public Student() {	//생성자는 반환값이 없음
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	
	//매개값이 있는 생성자
	//생성자는 필드의 값을 지정할때
	public Student(String nm, String sn) {	//초기값 2개
		name = nm;
		studNO = sn;
	}
	
	//생성자는 이름, 학번, 나이 채워주는 생성자
	public Student(String nm, String sn, int a) {	//매개값 이름이 같아도 된다 매개값 개수에 따라서 생성해 준다, 초기값 3개
		name = nm;
		studNO = sn;
		age = a;
	}
	
	
	public Student(String name, String studNO, int age, double height) {	//초기값을 지정해주는 생성자, 초기값 4개
		this.name = name;	//this.name은 필드의 name
		this.studNO = studNO;
		this.age = age;
		this.height = height;
	}

	//메소드
	void study() {
		System.out.println(name + "가 공부를 합니다.");
	}
	
	void eat() {
		System.out.println(name + "가 식사를 합니다.");
	}
	
	void showInfo() {	//정보를 보여주는 메소드, 필드가지고 와서 출력할 수 있다.
		System.out.println("이름은 " + name + "이고 학생번호는 " + studNO + "이고 키는" + height + "이고 나이는 " + age + "살입니다.");
	}


}

package co.deu.statics;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("234562-123345", "홍길동");
		p1.name = "김길동";
		//p1.ssn = "123345-567534";	//ssn은 final 이여서 이미 위에서 ssn에 값을 넣어 변경이 안됨
		
		Person p2 = new Person("345567-123345", "김길동");	//새로운 인스턴스..???

	}

}

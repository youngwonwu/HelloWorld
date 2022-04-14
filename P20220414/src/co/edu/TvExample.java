package co.edu;

public class TvExample {

	public static void main(String[] args) {
		
		//Television을 호출해서 쓴다
		int num = 0;
		String str = "Hello";
		
		Television tv = new Television();	//만든 새로운 유형의 타입, 변수, Instance
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 300000;
		tv.model = "30Inch";
		//기능
		tv.turnOn();
		tv.changeCha(10);
		tv.turnOff();
		System.out.println("tv 회사는: " + tv.company);
		
		Television tv1 = new Television();	//tv != tv1;
		tv1.company = "삼성";
		tv1.color = "검은색";
		tv1.price = 300000;
		tv1.model = "30Inch";
		
						//Instance의 주소값
		System.out.println(tv);
		System.out.println(tv1);
		System.out.println(tv == tv1);

	}

}

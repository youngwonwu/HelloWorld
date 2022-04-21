package co.edu.api;
//String 연습
public class StringExample {

	public static void main(String[] args) {

		//주민번호 => 생년원일 - 남/여 구분
		//950405-2345678 => 95년 4월 5일 생, 여자입니다.
		//991001-1234567 => 99년 10월 1일 생, 남자입니다.
		//9704051234567  => 97년 4월 5일 생, 남자입니다.
		//0505053456789  => 05년 5월 5일 생, 남자입니다.
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!
		//- 구분되게
		//01월 01일 -> 1월 1일
		//내가 주민번호 출력해서 해보기
		//이거도 해보기
		//!!!!!!!!!!!!!!!!!!!!!!!!!
		
		String result = checkInfo("991001-1234567");
						//checkInfo(String jumin)
		System.out.println(result);
	
	}
	
	public static String checkInfo(String jumin) {

		//기능구현
		
		String year = jumin.substring(0, 2);
		String month = jumin.substring(2, 4);
		String day = jumin.substring(4, 6);
		//System.out.println(year + "년 " + month + "월 " + day +"일 생");
		
		String secondNum = jumin.substring(7);
		//System.out.println(secondNum);
		String gender = null;
		if(secondNum.charAt(0) == '1') {
			gender = "남자입니다";
		} else if(secondNum.charAt(0) == '3') {
			gender = "남자입니다";
		} else if(secondNum.charAt(0) == '2') {
			gender = "여자입니다";
		} else if(secondNum.charAt(0) == '4') {
			gender = "여자입니다";
		}
		
		return year + "년 " + month + "월 " + day +"일 생, " + gender;	//return은 public static String타입이 선언되면 String 값만 출력됨
	}

}

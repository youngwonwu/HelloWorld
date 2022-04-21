package co.edu.api;

public class SystemExample {

	public static void main(String[] args) {

		System.out.println("start");
		//System.exit(0);	//이 시점에서 프로그램을 종료한다
		System.out.println("end");
		
		long start = System.currentTimeMillis();	//현재 시간을 
		long sum = 0;
		for(int i=0; i<100000; i++) {
			sum += i;
		}
		long end  =System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
	}

}

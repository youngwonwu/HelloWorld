package co.edu.collection.generic;

//public class Box {
//
//	Object field;	//Object: 클래스의 부모클래스, 어떤형식이든 다 받아온다
//	
//	public void setField(Object field) {
//		this.field = field;
//	}
//	
//	public Object getField() {
//		return field;
//	}


//public class Box<T> {	//<T>: String타입으로 저장한다
//
//	T field;
//	
//	public void setField(T field) {
//		this.field = field;
//	}
//	
//	public T getField() {
//		return field;
//	}


public class Box<String> {

	String field;
	
	public void setField(String field) {
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
	
	
}

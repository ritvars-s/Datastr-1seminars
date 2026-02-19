package datastr;

public class MyArrayList {
	//mainigie
	
	private char[] list;
	private int how_many_elements = 0;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	
	//konstruktori
	
	public MyArrayList() {
		list = new char[size];
	}
	
	public MyArrayList(int input_size) {
		if (input_size > 0 && input_size < 1000000) {
			size = input_size;
		}
		list = new char[size];
	}
	
	//funkcijas
	
	private boolean isEmpty() {
		//1 garais
		if(how_many_elements == 0) {
			return true;
		}
		else {
			return false;	
		}
		//2 isais if-else
		
		//return (how_many_elements == 0) ? true : false;
		
		//3 ar atgriezto vertibu
		
		//return (how_many_elements == 0);
		
	}
	private boolean isFull() {
		if(how_many_elements == size) {
			return true;
		}
		else {
			return false;
			}
		//2 veids
		//return (how_many_elements == size) ? true : false;
		
	}
	private void resize() {
		int newSize;
		if (how_many_elements < 200) {
			newSize = size * 2;
			
		}
		else {
			newSize = (int)(size * 1.5);
		}
		
		char[] newList = new char[newSize];
 		
		for(int i = 0; i < how_many_elements; i++) {
			newList[i] = list[i];
		}
 		
 		list = newList;
 		size = newSize;
		System.gc();
	}
	
}

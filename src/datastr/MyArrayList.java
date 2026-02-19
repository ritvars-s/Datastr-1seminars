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
		
}

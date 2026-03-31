package service;

import java.util.Arrays;

import datastr.MyArrayList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyArrayList<Character> symbols = new MyArrayList<Character>(3);
		symbols.add('a');// a
		symbols.add('b');// a b
		symbols.add('c');// a b c
		symbols.add('a');// a b c a
		try
		{
			symbols.print();// a b c a
			symbols.add('Z', 1);// a Z b c a
			symbols.print();// a Z b c a
			symbols.remove(2);//a Z c a
			symbols.print();//a Z c a
			System.out.println(symbols.get(1));//Z
			System.out.println(symbols.search('a'));//0 3
			System.out.println(
					Arrays.toString(symbols.getNextElements('a')));//Z
			
			symbols.sort();
			symbols.print();
			symbols.makeEmpty();//padaram tuksu
			symbols.add('W');
			symbols.print();//W
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		MyArrayList<Student> allStudents = new MyArrayList<Student>();
		Student s1 = new Student("Janis", "Berzins", "123456-12345");
		Student s2 = new Student("Juris", "Sesks", "123455-12345");
		Student s3 = new Student("Levis", "Ozols", "123466-12345");
		try {
				allStudents.add(s1);
				allStudents.add(s2);
				allStudents.add(s3, 0);
				allStudents.print();
				System.out.println(allStudents.search(s3)); //<- kura indeksa glabajas Levis
				System.out.println(Arrays.toString(allStudents.getNextElements(s3))); //pec levis nakosais elements
				System.out.println("========sort===========");
				allStudents.sort();
				allStudents.print();
				System.out.println("========remove===========");
				allStudents.remove(0);
				allStudents.print();
				System.out.println("========makeEmpty===========");
				allStudents.makeEmpty();
				//allStudents.print();
				allStudents.add(s1);
				allStudents.print();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}

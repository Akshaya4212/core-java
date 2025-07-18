package myprograms;

import java.util.ArrayList;
public class ArrayListProgram {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
	        list.add ("Apple");
	        list.add("cherry");
	        list.add("banana");
	        list.add("Apple");
	        System.out.println("ArrayList: " + list);
	        list.remove("cherry");//delete an element
	        System.out.println("After removing cherry: " + list );
	        //access an element
	        String firstElement = list.get(0);
	        System.out.println("First element:" + firstElement);
	    }
	}
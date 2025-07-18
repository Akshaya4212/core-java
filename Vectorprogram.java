package myprograms;
//it provides a growble array of objects
import java.util.Vector;
public class VectorProgram {

	public static void main(String[] args) {
		Vector<Integer> numbers=new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		
		System.out.println("vector: "+numbers);
		
		//remove an element
		numbers.remove(Integer.valueOf(20));
		System.out.println("After removing 20:" + numbers);

	}

}

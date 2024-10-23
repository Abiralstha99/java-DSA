import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		//syntax
		// datatype [] variable_name = new datatype[size]; 
//		int []  arr = new int[5]; // arr (a reference variable) is pointing to an  
//	    array object that contains type integer
//		int [] arr1 = {11,55,54,21,1};
		
		int [] arr; // declaration of array. arr is getting defined in the stack
		arr = new int[5]; // initialisation: actually here object is being created in the
		// memory (heap)
		
//		String [] str = new String[4];
//		System.out.println(str[0]);
		
		//input using for loop 
//		for (int i = 0 ; i<5;i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		// output by converting it to string
//		System.out.println(Arrays.toString(arr));
		
		//output using for loop 
//		for (int i = 0; i<5;i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		for (int num : arr) { // for every element in array print the element
//			System.out.print(num + " "); // here num represent element of array
//		}
		
		
		//array of objects
		String [] str = new String [4];
		for (int i = 0; i<str.length;i++) {
			str[i] = in.next();
		}
		System.out.println(Arrays.toString(str));
		
		//modify
		str[2] = "apple";
		System.out.println(Arrays.toString(str));
	}

} 
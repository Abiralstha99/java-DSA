import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		ArrayList <Integer> list = new ArrayList <> (10);
		
		//Add any elements to the arraylist
//		list.add(5);
//		list.add(7);
		System.out.println(list);
		
		//creating a loop for index
		for (int i = 0;i<5 ; i++) {
			list.add(in.nextInt());
		}
		
		//printing the arraylist
		for (int i = 0;i<5;i++) {
			System.out.println(list.get(i));
		}
		in.close();
	}
}

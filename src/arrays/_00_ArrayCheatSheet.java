package arrays;

import java.util.Collections;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] myStrings = { "a", "b", "c", "d", "e" };
		
		//2. print the third element in the array
		System.out.println("third: " + myStrings[2]);
		
		//3. set the third element to a different value
		myStrings[2] = "z";
		
		//4. print the third element again
		System.out.println("third: " + myStrings[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<myStrings.length; i++) {
			System.out.println(myStrings[i] + " ");
		}
		
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for( int i=0; i<fifty.length; i++) {
			fifty[i] = r.nextInt(101);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 999;
		int largest = 0;
		for( int i = 0; i<fifty.length; i++) {
			if ( fifty[i] < smallest ) {
				smallest = fifty[i];
			}
			if( fifty[i] > largest ) {
				largest = fifty[i];
			}
		}
		System.out.println("smallest: " + smallest);
		System.out.println("largest:  " + largest);
		
		//9 print the entire array to see if step 8 was correct
		printIntArray( fifty );
		
		//Collections.sort(fifty);
		java.util.Arrays.sort(fifty);
		System.out.println("\n");
		printIntArray( fifty );
		
		//10. print the largest number in the array.
	}
	
	static void printIntArray( int[] array ){
		for( int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			if( i != 0 && i % 10 == 0) {
				System.out.println("");
			}
		}
	}
}

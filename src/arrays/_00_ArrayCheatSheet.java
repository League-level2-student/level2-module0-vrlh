package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = new String[5];
		//2. print the third element in the array
		System.out.println(words[3]);
		//3. set the third element to a different value
		words[3] = "g";
		//4. print the third element again
		System.out.println(words[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(String word: words) {
			System.out.println(word);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for(int i = 0; i<50; i++) {
			nums[i] = randy.nextInt(500);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = nums[0];
		for (int num: nums) {
			if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("The smallest number is " +  smallest);
		//9 print the entire array to see if step 8 was correct
		for (int num: nums) {
			System.out.println(num);
		}
		//10. print the largest number in the array.
		int largest = nums[0];
		for(int num: nums) {
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println("The largest number is " + largest);
	}
}

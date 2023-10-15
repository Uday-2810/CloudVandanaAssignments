package com.uday;
import java.util.Random;

public class ArrayShuffler {

	public static void shuffleArray(int[] arr) {
		int n = arr.length;
		Random rand = new Random();
		for (int i = n - 1; i > 0; i--) {
			//Generate a random index from 0 to i
			int randIndex = rand.nextInt(i + 1);
			//Swap the elements randIndex and i
			int temp = arr[i];
			arr[i] = arr[randIndex];
			arr[randIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
		shuffleArray(originalArray);
		System.out.println("Shuffled Array: ");
		for (int num : originalArray) {
			System.out.print(num + " ");
		}

	}

}

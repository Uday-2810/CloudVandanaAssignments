package com.uday;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

	public static boolean isPangram(String str) {
        Set<Character> letters = new HashSet<>();
        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }
        // Check if all 26 letters from 'a' to 'z' are present in the set
        return letters.size() == 26;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine().toLowerCase(); // Convert the input to lowercase
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        sc.close();
    }
}

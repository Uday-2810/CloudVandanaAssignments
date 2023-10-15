package com.uday;
import java.util.Scanner;

public class RomanToIntegerConverter {
	public static int romanToInteger(String str) {
        // Define a mapping of Roman number to their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int result = 0;
        int i = 0;
        while (i < str.length()) {
            for (int j = 0; j < symbols.length; j++) {
                if (i + symbols[j].length() <= str.length() && str.substring(i, i + symbols[j].length()).equals(symbols[j])) {
                    result += values[j];
                    i += symbols[j].length();
                    break;
                }
            }
        }
        // If the entire string is not processed, it's an invalid Roman number
        if (i < str.length()) {
            return -1;
        }
        return result;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Roman number: ");
        String romanNumeral = sc.nextLine();
        int result = romanToInteger(romanNumeral);
        if (result == -1) {
            System.out.println("Invalid Roman number.");
        } else {
            System.out.println("Integer equivalent: " + result);
        }
        sc.close();
    }
}

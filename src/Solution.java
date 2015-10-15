import java.util.Scanner;

import javax.swing.JOptionPane;

public class Solution {

	static boolean isAnagram(String firstString, String secondString) {
		int letters = secondString.length();
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		for (int i = 0; i < firstString.length(); i++) {
			for (int j = 0; j < secondString.length(); j++) {
				if (firstString.charAt(i) == secondString.charAt(j)) {
					letters--;
					secondString = secondString.replaceFirst(Character.toString(secondString.charAt(j)), "");
					break;
				}
			}
		}
		if (letters == 0)
			return true;
		else
			return false;
		// Complete the function

	}

	public static void main(String[] args) {

		String firstString = JOptionPane.showInputDialog("Enter a word.");
		String secondString = JOptionPane
				.showInputDialog("Enter another word.");
		boolean ret = isAnagram(firstString, secondString);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}

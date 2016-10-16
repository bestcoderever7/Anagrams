import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Solution {

	static boolean isAnagram(String firstString, String secondString) {
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		boolean areAnagrams = true;
		char[] letters1 = firstString.toCharArray();
		char[] letters2 = secondString.toCharArray();
		Arrays.sort(letters1);
		Arrays.sort(letters2);
		for(char c : letters1)
		{
			for(char c2 : letters2)
			{
				if(Character.toString(c).equals(Character.toString(c2))){}
				else
				{
					areAnagrams = false;
					break;
				}
			}
		}
		return areAnagrams;
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

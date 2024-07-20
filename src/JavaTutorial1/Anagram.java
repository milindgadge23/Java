package JavaTutorial1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "madam";
		String s2 = "admam";

		char[] abc = s1.toCharArray();
		Arrays.sort(abc);

		char[] pqr = s2.toCharArray();
		Arrays.sort(pqr);

		if (Arrays.equals(abc, pqr)) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not  anagram");
		}

	}

}

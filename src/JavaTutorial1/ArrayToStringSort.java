package JavaTutorial1;

import java.util.Arrays;

public class ArrayToStringSort {

	public static void main(String[] args) {
		int abc[] = { 100, 200, 800, 900, 400, 500 };

		// Arrays.toString() it used to print all arrays values in same line
		// return type is String
		String a = Arrays.toString(abc);
		System.out.println(a);

		// sort the all array values in ascending order
		// return type is void
		Arrays.sort(abc);

		String b = Arrays.toString(abc);
		System.out.println(b);
	}

}

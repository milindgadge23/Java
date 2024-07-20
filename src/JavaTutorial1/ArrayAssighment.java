package JavaTutorial1;

import java.util.Arrays;

public class ArrayAssighment {

	public static void main(String[] args) {
		String abc[] = new String[5];

		abc[0] = "java";
		abc[1] = "selenium";
		abc[2] = "testng";
		abc[3] = "cucumber";
		abc[4] = "restassured";

		// reverse all the values from arrays.

//		//for (int i = abc.length - 1; i >= 0; i--) {
//			System.out.println(abc[i]);
//		}

		// find max values in int array
		Arrays.sort(abc);
		System.out.println(abc[4]);
		
		

		// find min values in int array
	}

}

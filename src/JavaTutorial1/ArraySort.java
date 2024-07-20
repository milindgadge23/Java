package JavaTutorial1;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
			int[] abc = new int[5];

			abc[0] = 100;
			abc[1] = 20;
			abc[2] = 23;
			abc[3] = 244;
			abc[4] = 34;

			// sort arrays values as per the ascending order
			Arrays.sort(abc);//20,23,34,100,244

			int a = abc.length;// 5

			// find max value
			int max = abc[a - 1];
			System.out.println(max);
			
			//find 2nd max value
			int secondmax = abc[a-2];
			System.out.println(secondmax);
			
			// find min values
			int min = abc[0];
			System.out.println(min);

	}

}

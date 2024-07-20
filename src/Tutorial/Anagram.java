package Tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // beautiful code//
		
		System.out.println("Enter String 1");
		
		String s=sc.nextLine();
		 
		System.out.println("Enter String 2");
		
		String v=sc.nextLine();
		
		char x[]=s.toCharArray();
		Arrays.sort(x);
		
		char [] z=v.toCharArray();
		Arrays.sort(z);
		
		
		if (Arrays.equals(x, z))
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}
	}

}

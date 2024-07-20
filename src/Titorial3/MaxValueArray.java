package Titorial3;

public class MaxValueArray {

	public static void main(String[] args) {
		//Max Value
//		1: To find MaxValue in Array
//		Step1: first we have to take 1 int Array 
		
		int [] a = {100,400,25,180,500};
		//Step2: then we have take max as obj [0];
		int max = a[0];
		
		for ( int i=0; i< a.length ;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
				
		}
		System.out.println(max);
	}

}

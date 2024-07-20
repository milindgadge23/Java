package Titorial3;

public class MinValue {

	public static void main(String[] args) {
		
		int []a = {50,200,80,100};
		
		int min = a[0];
		
		for (int i =0; i<a.length;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
    System.out.println(min);
	}

}

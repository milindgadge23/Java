package Titorial3;

public class SecondMax {

	public static void main(String[] args) {
		int [] a = {100,50,40,30,70,60};
		
		int temp;
		
		for (int i=0;i<a.length;i++)
		{
			for (int j =i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.println(a[a.length-2]);
		
	}

}

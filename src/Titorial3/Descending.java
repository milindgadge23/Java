package Titorial3;

public class Descending {

	public static void main(String[] args) {
		 int [] a = { 100,50,20,30,40,80,};
		 
		 int temp ;
		 
		 for (int i=0; i<a.length;i++)
		 {
			 for (int j=i+1;j<a.length;j++)
			 {
				 if (a[i]<a[j])
				 {
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp ;
				 }
			 }
			 System.out.println(a[i]);
		 }
		 

	}

}

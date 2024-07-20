package Titorial3;

public class Ascending {

	public static void main(String[] args) {
		 int [] a = { 100, 40,200, 50,30,20};
		 
		 int temp ;
		 
		 for ( int i= 0; i<a.length;i++)
		 {
			 for ( int j= i+1; j<a.length;j++)
			 {
				 if (a[i]>a[j])
				 {
					 temp =a[i]; // temp = 100
					 a[i] = a[j]; // 100 =40
					 a[j] = temp; // 40 =100
				 }
			 }
			 System.out.println(a[i]);
		 }

	}

}

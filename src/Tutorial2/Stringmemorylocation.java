package Tutorial2;

public class Stringmemorylocation {

	public static void main(String[] args) {
		String c="selenium";//SCP Memory ---> same Memory location---> same Memory location
		String d="selenium";//SCP Memory---> same Memory location
		
		
		//Heap Memory--- different Memory location
				String a = new String("selenium");
				String b = new String("selenium");
		
		
		
		System.out.println(a.equals(b));//true  content check
		System.out.println(a==b);     //false memory location check
	}

}

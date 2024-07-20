package Tutorial2;

public class Demo1 {

	public static void main(String[] args) {
		//remove the 2 or more space in between words
				String a="selenium	testing";
				
				String b= a.replaceAll("\\s+", " ");
				System.out.println(b);
	}

}

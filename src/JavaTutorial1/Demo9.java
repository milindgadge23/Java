package JavaTutorial1;

public class Demo9 {

	public static void findValues(String abc) {
		// find numbers
		String numbers = abc.replaceAll("[^0-9]", "");
		System.out.println(numbers);

		// find upper case letter
		String uppercase = abc.replaceAll("[^A-Z]", "");
		System.out.println(uppercase);

		// find lower case letter
		String lowercase = abc.replaceAll("[^a-z]", "");
		System.out.println(lowercase);

		// find special character
		String specialCharacter = abc.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(specialCharacter);
	}

	public static void main(String[] args) {
		Demo9.findValues("90912abcABC2&%#$a234");

	}

}

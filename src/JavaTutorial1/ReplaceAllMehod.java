package JavaTutorial1;

public class ReplaceAllMehod {
	
	public static void findgroups(String abc)
	{
		String numbers = abc.replaceAll("[^0-9]", "");
		System.out.println(numbers);
		
		String upperCase = abc.replaceAll("[^A-Z]", "");
		System.out.println(upperCase);
		
		String lowerCase = abc.replaceAll("[^a-z]", "");
		System.out.println(lowerCase);
		

		String specialChracter = abc.replaceAll("[0-9a-zA-Z]", "");
		System.out.println(specialChracter);
	}

	public static void main(String[] args) {
		ReplaceAllMehod.findgroups("9AR^55%@%ahayA123P");
	}
}


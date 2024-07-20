package JavaTutorial1;

public class CloneMethodArray {

	public static void main(String[] args) {
		// Copy all values from abc array to xyz array.
//				int abc[] = { 100, 200, 400, 500 };
//
//				int xyz[] = abc[];
//                System.out.println(abc[2]);
//				// Copy all values from abc array to pqr array.
//				int[] pqr = abc;
//
//				System.out.println(abc[1]);
//				System.out.println(xyz[1]);
//				System.out.println(pqr[1]);
//                
		//copy the some array values
				int abc[] = { 100, 200, 400, 500,800,900 };
				
							//400, 200
				int [] xyz = {abc[2],abc[1]};
				
				System.out.println(xyz[0]);//400
	}

}

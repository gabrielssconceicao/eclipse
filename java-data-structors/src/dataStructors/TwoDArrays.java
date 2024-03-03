package dataStructors;

public class TwoDArrays {

	public static void main(String[] args) {
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		for(int i=0; i<cars.length;i++) {
			for(int j=0; j<cars[i].length;j++) {
				System.out.println("Car[" + i + "]" + "[" + j + "]: "+ cars[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		
		String[][] letters = {
								{"a","b","c"},
								{"d","e","f"},
								{"g","h","i"}
							};

	}

}

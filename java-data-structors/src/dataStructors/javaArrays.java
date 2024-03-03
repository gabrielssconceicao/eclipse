package dataStructors;

public class javaArrays {

	public static void main(String[] args) {
		String[] cars = {"Camaro","Corvette", "Tesla","BMW"};
		System.out.println(cars[0]);
		cars[0] = "Mustang";
		System.out.println(cars[0]);
		System.out.println(cars[3]);
		System.out.println();
		System.out.println();
		// or
		
		String[] otherCars = new String[3];
		otherCars[0] = "Tesla";
		otherCars[1] = "BWM";
		otherCars[2] = "Fusca";
		
		for(int i=0; i<otherCars.length;i++) {
			System.out.println(otherCars[i]);
		}
	}

}

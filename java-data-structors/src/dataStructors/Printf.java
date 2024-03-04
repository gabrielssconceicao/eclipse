package dataStructors;

public class Printf {

	public static void main(String[] args) {
		// printf()  an optional method to control, format and display text to the console window
		//           two arguments = format string + (object/variable/value)
		//           % [flags] [precision] [conversion-character]

		
		
		boolean myBoolean = true;
		char myChar ='@';
		String myString = "Bro";
		int myInt = 50;
		double mtDouble = 1000;
		
		//[conversion-character]
		System.out.println();
		System.out.printf("%b\n",myBoolean);
		System.out.printf("%c\n",myChar);
		System.out.printf("%s\n",myString);
		System.out.printf("%d\n",myInt);
		System.out.printf("%f\n",mtDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.println();
		System.out.printf("Hello %10s !\n",myString);
		System.out.printf("Hello %-10s !\n",myString);
		
		//[precision]
		// set number of digits of precision when outputting floating-point values
		System.out.println();
		System.out.printf("I have this much money %.2f\n",mtDouble);
		System.out.printf("I have this much money %.4f\n",mtDouble);
		
		//[flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or a minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("I have this much money %+f\n",mtDouble);
		System.out.printf("I have this much money %020f",-1000.0);
	}

}

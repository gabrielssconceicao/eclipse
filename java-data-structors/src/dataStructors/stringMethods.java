package dataStructors;

public class stringMethods {

	public static void main(String[] args) {
		String name = "Teste";
		
		boolean result = name.equals("Test");
		System.out.println(result);
		
		result = name.equalsIgnoreCase("test");
		System.out.println(result);
		
		int length = name.length();
		System.out.println("Name length: "+length);
		
		char letter = name.charAt(0);
		System.out.println("Letter at 0 position: "+letter);
		
		int position = name.indexOf("t");
		System.out.println("'t' position: "+position);
		position = name.indexOf("T");
		System.out.println("'T' position: "+position);
		
		result = name.isEmpty();
		System.out.println("Is name empty? "+result);
		
		String upper = name.toUpperCase();
		System.out.println(upper);
		
		String lower = name.toLowerCase();
		System.out.println(lower);
		
		String withOutTrimName  = "            Bro               ";
		System.out.println(withOutTrimName);
		String withTrimName = withOutTrimName.trim();
		System.out.println(withTrimName);
		
		String replace = name.replace('e', 'A');
		System.out.println(replace);
	}

}

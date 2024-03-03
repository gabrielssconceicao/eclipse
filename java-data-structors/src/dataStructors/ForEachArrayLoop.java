package dataStructors;
import java.util.ArrayList;
public class ForEachArrayLoop {

	public static void main(String[] args) {
		
		String[] animals = {"dog","cat","bird","fish"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		ArrayList<String> birds = new ArrayList<String>();
		birds.add("owl");
		birds.add("eagle");
		birds.add("penguin");
		
		for(String j : birds) {
			System.out.println(j);
		}

	}

}

package dataStructors;
import java.util.*;
public class TwoDimensioalArrayList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatos");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("water");
		drinksList.add("soda");
		
		System.out.println(drinksList);
		System.out.println(bakeryList);
		System.out.println(produceList);
		
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		System.out.println();
		System.out.println("Grocery list: "+groceryList);
		System.out.println();
		System.out.println("Get an elemnt");
		System.out.println(groceryList.get(0).get(1));

	}

}

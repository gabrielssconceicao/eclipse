package structures;

import java.util.ArrayList;

public class TwoDArrayLists {
  public static void main(String[] args) {
    ArrayList<String> bakeryList = new ArrayList<String>();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");
    System.out.println(bakeryList);
    System.err.println();

    ArrayList<String> produceList = new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    System.out.println(produceList);
    System.err.println();

    ArrayList<String> drinks = new ArrayList<String>();
    drinks.add("soda");
    drinks.add("coffee");
    System.out.println(drinks);
    System.err.println();

    ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinks);
    System.out.println(groceryList);
    System.out.println();
    System.out.println(groceryList.get(0).get(1));
  }
}

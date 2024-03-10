package structures;

public class Array {
  public static void main(String[] args) {
    String[] cars = { "Volvo", "BMW", "Ford" };
    printArray(cars);

    cars[0] = "Opel";
    cars[1] = "Mercedes";
    printArray(cars);

    String[] foods = new String[2];
    foods[0] = "Pizza";
    foods[1] = "Hamburger";
    printArray(foods);
  }

  public static void printArray(String[] array) {
    System.out.println("-----------------------------");
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%d - %s \n", i, array[i]);
    }
    System.out.println();
  }
}

package structures;

public class TwoDArrays {
  public static void main(String[] args) {

    // String[][] cars = new String[3][3];

    // cars[0][0] = "Volvo";
    // cars[0][1] = "BMW";
    // cars[0][2] = "Ford";

    // cars[1][0] = "Opel";
    // cars[1][1] = "Mercedes";
    // cars[1][2] = "Fiat";

    // cars[2][0] = "Audi";
    // cars[2][1] = "Volkswagen";
    // cars[2][2] = "Renault";
    String[][] cars = {
        { "Volvo", "BMW", "Ford" },
        { "Opel", "Mercedes", "Fiat" },
        { "Audi", "Volkswagen", "Renault" }
    };

    print2DArray(cars);

  }

  private static void print2DArray(String[][] array) {
    System.out.println("-----------------------------");
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      System.out.println();
      for (int j = 0; j < array[i].length; j++) {
        System.out.printf("Car[%d][%d]: %s\n", i, j, array[i][j]);
      }
    }
    System.out.println();
    System.out.println("-----------------------------");

  }
}

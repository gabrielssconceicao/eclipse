package algorithms;

public class LinearSearch {
  public static void main(String[] args) {
    // linear search - Iterate through a collection one element at a time
    int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

    int index = linearSearch(array, 8);

    if (index != -1) {
      System.out.println("Found at index: " + index);
    } else {
      System.out.println("Not found");
    }
  }

  private static int linearSearch(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
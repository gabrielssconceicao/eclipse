package algorithms;

public class InsertionSort extends CreateArray {
  // Insertion sort = after comparing elements to the left,
  // shift elements to the right to make room to insert a value

  // Quadratic time O(n^2)
  // small data set = decent
  // large data set = BAD

  // Less steps than Bubble sort
  // Best case is O(n) compared to Selection sort O(n^2)

  public static void main(String[] args) {
    int[] array = createUnsortedArray(6);

    printArray(insertionSort(array));
  }

  private static int[] insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;
    }
    return array;
  }
}

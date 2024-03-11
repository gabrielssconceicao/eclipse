package algorithms;

public class SelectSort extends CreateArray {
  public static void main(String[] args) {
    int[] array = createUnsortedArray(10);

    printArray(array);

    int[] sortedArray = selectSort(array);

    printArray(sortedArray);
  }

  private static int[] selectSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }

    return array;
  }
}

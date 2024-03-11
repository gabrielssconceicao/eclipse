package algorithms;

public class BubbleSort extends CreateArray {

  public static void main(String[] args) {
    int[] array = createUnsortedArray(100);

    int[] sortedArray = bubbleSort(array);
    printArray(sortedArray);
  }

  private static int[] bubbleSort(int[] array) {
    int[] newArray = array;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (newArray[j] > newArray[j + 1]) {
          int temp = newArray[j];
          newArray[j] = newArray[j + 1];
          newArray[j + 1] = temp;
        }
      }
    }

    return newArray;
  }
}

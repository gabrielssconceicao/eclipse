package algorithms;

public class CreateArray {
  protected static int[] createArray(int size) {
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    return array;
  }
}

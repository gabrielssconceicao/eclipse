package algorithms;

public class BinarySearch extends CreateArray {
  // binary search = Search algorithm that finds the position
  // of a target value within a sorted array.
  // Half of the array is eliminated during each "step"

  public static void main(String[] args) {
    int[] array = createArray(1000000);
    int target = 45;

    int index = binarySearch(array, target);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }
  }

  // private static int[] createArray(int size) {
  // int[] array = new int[size];
  // for (int i = 0; i < array.length; i++) {
  // array[i] = i;
  // }
  // return array;
  // }

  private static int binarySearch(int[] array, int target) {
    int low = 0;
    int high = array.length - 1;
    int steps = 0;

    while (low <= high) {
      int mid = (low + high) / 2;
      int value = array[mid];
      steps++;
      System.out.println("Middle: " + mid);

      if (value < target)
        low = mid + 1;
      else if (value > target)
        high = mid - 1;
      else {
        System.out.println("Steps: " + steps);
        return mid;
      }
    }
    return -1;
  }
}

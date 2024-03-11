package algorithms;

public class InterpolationSearch extends CreateArray {
  // interpolation search = Search algorithm that finds the position of a target
  // value within a sorted array.
  // interpolation search = improvement over binary search best used for
  // "uniformly" distributed data
  // "guesses" where a value might be based on calculated probe results
  // if probe is incorrect, search area is narrowed, and a new probe is calculated

  // average case: O(log(log(n)))
  // worst case: O(n) [values increase exponentially]
  public static void main(String[] args) {
    int[] array = createArray(10);

    int index = interpolationSearch(array, 1);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found");
    }
  }

  private static int interpolationSearch(int[] array, int value) {
    int heigh = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[heigh] && low <= heigh) {
      int probe = low + (heigh - low) * (value - array[low]) / (array[heigh] - array[low]);

      System.out.println("Probe: " + probe);

      if (array[probe] == value) {
        return probe;
      } else if (array[probe] < value) {
        low = probe + 1;
      } else {
        heigh = probe - 1;
      }
    }

    return -1;
  }
}

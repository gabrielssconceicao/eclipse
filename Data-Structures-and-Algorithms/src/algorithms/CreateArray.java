package algorithms;

public class CreateArray {

  protected static int[] createArray(int size) {
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
    return array;
  }

  protected static int[] createUnsortedArray(int size) {
    int[] array = new int[size];
    boolean[] used = new boolean[100]; // Array para rastrear os números usados
    int count = 0; // Contador para acompanhar quantos números únicos foram gerados

    while (count < size) {
      int randomNumber = (int) (Math.random() * 100);

      // Verifica se o número já foi usado
      if (!used[randomNumber]) {
        array[count] = randomNumber;
        used[randomNumber] = true; // Marca o número como usado
        count++;
      }
    }
    return array;
  }
}

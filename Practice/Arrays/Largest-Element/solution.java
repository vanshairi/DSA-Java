public class solution {

  public static void main(String[] args) {

    int[] array = { 8, 10, 5, 7, 9 };
    int largest = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > largest) {
        largest = array[i];
      }
    }

    System.out.println(largest);

  }

}

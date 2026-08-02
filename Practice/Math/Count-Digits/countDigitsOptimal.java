public class countDigitsOptimal {

  public static void main(String[] args) {

    int n = 0;

    if (n == 0) {
      System.out.println("1");
    }

    else {
      int count = (int) (Math.log10(n) + 1);
      System.out.println(count);
    }
  }

}

public class optimal {

  public static int gcd(int a, int b) {

    while (a != 0 && b != 0) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return Math.max(a, b);
  }

  public static void main(String[] args) {

    System.out.println(gcd(5, 10));

  }

}

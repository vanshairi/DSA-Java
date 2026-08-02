import java.util.Scanner;

public class solution {

  public static boolean isPrime(int num) {

    if (num == 0 || num == 1) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int num = scanner.nextInt();

    System.out.println(isPrime(num));

    scanner.close();
  }
}

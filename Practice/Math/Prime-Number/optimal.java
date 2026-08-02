import java.util.Scanner;

public class optimal {

  public static boolean isPrime(int num) {

    if (num <= 1) {
      return false;
    }

    int count = 0;

    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        count++;

        if (num / i != i) {
          count++;
        }

      }
    }

    return count == 2;

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int num = scanner.nextInt();

    System.out.println(isPrime(num));

    scanner.close();
  }

}

public class solution {

  public static boolean isArmstrong(int num) {

    int n = num;
    int numOfDigits = String.valueOf(num).length();
    int sum = 0;

    while (num != 0) {
      int digit = num % 10;
      num /= 10;
      sum += Math.pow(digit, numOfDigits);
    }

    if (sum == n) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {

    System.out.println(isArmstrong(123));

  }

}

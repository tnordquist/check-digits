package edu.cnm.deepdive;

import static java.lang.Integer.parseInt;

public class Check {

  public static int digitSum(int input) {

    int dividend = input;
    final int DIVISOR = 10;
    int quotient = dividend/DIVISOR;
    int remainder = dividend%DIVISOR;
    int sumRemainders=0;
    sumRemainders+= remainder;

    while(quotient>0) {
      dividend = quotient;
      quotient = dividend/DIVISOR;
      remainder=dividend%DIVISOR;
      sumRemainders+=remainder;
    }

    return sumRemainders;
  }

  public static void main(String[] args) {

    int fromCom = parseInt(args[0]);

    int sumDigits = digitSum(fromCom);
    final int DIVISOR = 9;
    System.out.printf("\n");
    System.out.printf("%5d\n", fromCom);
    System.out.printf("%5d\n", fromCom%DIVISOR);
    System.out.printf("%5d\n", sumDigits);
    System.out.printf("%5d\n", sumDigits%DIVISOR);
    System.out.println();

  }

}

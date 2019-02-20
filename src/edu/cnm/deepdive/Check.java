package edu.cnm.deepdive;

import static java.lang.Integer.parseInt;

public class Check {

  public static int digitSum(int input) {

    int dividend = input;
    final int DIVISOR = 10;
    int quotient = dividend / DIVISOR;
    int remainder = dividend % DIVISOR;
    int sumRemainders = 0;
    sumRemainders += remainder;

    while (quotient > 0) {
      dividend = quotient;
      quotient = dividend / DIVISOR;
      remainder = dividend % DIVISOR;
      sumRemainders += remainder;
    }

    return sumRemainders;
  }

  /*
  Write the implementation of the method, so that it behaves like digitSum,
  except that after it adds the digits together, it continues doing so, until we
  have a single digit number. For example, if input has the value 147, then the
  digit sum is 1 + 4 + 7 = 12. However, for this method, we would repeat that
  process until we have a single digit number. So after getting a sum of 12, we
  add those digits together to get 1 + 2 = 3. Thus, in this invocation, this
  method should return 3.
   */
  public static int reducedDigitSum(int input) {

    if (input < 10) {
      return input;
    } else {

      return reducedDigitSum(digitSum(input));

    }
  }

  public static void main(String[] args) {

    int fromCom = parseInt(args[0]);
   // int fromCom = 4046;

    int singleDigit = reducedDigitSum(fromCom);

    System.out.printf("%4d", singleDigit);


  }

}

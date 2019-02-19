package edu.cnm.deepdive;

import static java.lang.Integer.parseInt;

public class Check {

  public static int digitSum(int forStr) {

    String intStr = Integer.toString(forStr);
    int sumDigits = 0;

    for (int i = 0; i < intStr.length(); ++i) {
      String subString = intStr.substring(i, i + 1);
      sumDigits += parseInt(subString);
    }
    return sumDigits;
  }

  public static void main(String[] args) {

    int fromCom = parseInt(args[0]);

    int sumDigits = digitSum(fromCom);
    final int DIVISOR = 9;

    System.out.printf("%5d", fromCom);
    System.out.printf("%5d", fromCom%DIVISOR);
    System.out.printf("%5d", sumDigits);
    System.out.printf("%5d%", sumDigits%DIVISOR);
    System.out.println();

  }

}

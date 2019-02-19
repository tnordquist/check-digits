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

//Print the following values (formatted as you think appropriate):
//    The local variable declared and assigned in step (6.a).
//The remainder obtained when the local variable declared and defined in step (6.a) is divided by 9.
//The local variable declared and assigned in step (6.b).
//The remainder obtained when the local variable declared and defined in step (6.b) is divided by 9.

    System.out.printf("%5d", fromCom);
    System.out.printf("%5d", fromCom%DIVISOR);
    System.out.printf("%5d", sumDigits);
    System.out.printf("%5d%", sumDigits%DIVISOR);
    System.out.println();

  }

}

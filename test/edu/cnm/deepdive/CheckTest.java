package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckTest {

  static final int[] INPUT = {4046,6325,9788,5676,88,8925,8598,2025,4738,453};
  static final int[] EXPECTED = {14,16,32,24,16,24,30,9,22,12};
  static final int[] REDUCED_EXPECTED = {5,7,5,6,7,6,3,9,4,3};

  @Test
  void digitSum() {

    for(int i = 0; i<INPUT.length; ++i) {
      int input = INPUT[i];
      int expected = EXPECTED[i];
      int actual = Check.digitSum(input);
      assertEquals(expected,actual);
    }

  }

  @Test
  void reducedDigitSum() {

    for(int i = 0; i<INPUT.length; ++i) {
      int input = INPUT[i];
      int expected = REDUCED_EXPECTED[i];
      int actual = Check.reducedDigitSum(input);
      assertEquals(expected,actual);
    }
  }
}
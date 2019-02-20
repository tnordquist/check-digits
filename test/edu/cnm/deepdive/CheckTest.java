package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CheckTest {

  @ParameterizedTest(name = "[{index}] input = {0}; expected = {1}")
  @CsvFileSource(resources = "test.csv")
  @DisplayName("Check sum of digits")
  void digitSum(int input, int expected) {

    int actual = Check.digitSum(input);
    assertEquals(expected, actual);

  }

//  @Test
//  void reducedDigitSum() {
//
//    for (int i = 0; i < INPUT.length; ++i) {
//      int input = INPUT[i];
//      int expected = REDUCED_EXPECTED[i];
//      int actual = Check.reducedDigitSum(input);
//      assertEquals(expected, actual);
//    }
//  }
}
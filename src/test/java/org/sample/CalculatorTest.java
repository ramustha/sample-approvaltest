package org.sample;

import org.approvaltests.Approvals;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void additionTest() {
    Calculator calculator = new BasicCalculator(1);
    calculator.addition(1);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 2
  }

  @Test
  public void subtractionTest() {
    Calculator calculator = new BasicCalculator(1);
    calculator.subtraction(1);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 0
  }

  @Test
  public void multiplicationTest() {
    Calculator calculator = new BasicCalculator(1);
    calculator.multiplication(1);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 1
  }

  @Test
  public void divisionTest() {
    Calculator calculator = new BasicCalculator(1);
    calculator.division(1);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 1
  }

  @Test
  public void additionWithDefaultValueTest() {
    Calculator calculator = new BasicCalculator();
    calculator.addition(1);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 1
  }

  @Test(expected = NullPointerException.class)
  public void additionWithNullValueTest() {
    Calculator calculator = new BasicCalculator();
    calculator.addition(null);

    Approvals.verify(calculator.getResult()); // verify output, expected value = 1
  }
}

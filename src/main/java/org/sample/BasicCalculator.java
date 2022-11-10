package org.sample;

public class BasicCalculator implements Calculator {
  private Number result;

  public BasicCalculator() {
    this.result = 0;
  }

  public BasicCalculator(Number initialValue) {
    this.result = initialValue;
  }

  @Override
  public Number getResult() {
    return result;
  }

  @Override
  public Calculator addition(Number value) {
    nonNullCheck(value);
    result = result.longValue() + value.longValue();
    return this;
  }

  @Override
  public Calculator subtraction(Number value) {
    nonNullCheck(value);
    result = result.longValue() - value.longValue();
    return this;
  }

  @Override
  public Calculator multiplication(Number value) {
    nonNullCheck(value);
    result = result.longValue() * value.longValue();
    return this;
  }

  @Override
  public Calculator division(Number value) {
    nonNullCheck(value);
    result = result.longValue() / value.longValue();
    return this;
  }


  private static void nonNullCheck(Number value) {
    if (value == null) {
      throw new NullPointerException("Value must be set");
    }
  }
}

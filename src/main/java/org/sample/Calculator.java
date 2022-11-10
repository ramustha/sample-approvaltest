package org.sample;

public interface Calculator {

  Number getResult();

  Calculator addition(Number value);

  Calculator subtraction(Number value);

  Calculator multiplication(Number value);

  Calculator division(Number value);

}

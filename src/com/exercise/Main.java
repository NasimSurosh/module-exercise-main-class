package com.exercise;
import com.math.operation.MathOperation;

public class Main {

  public static void main(String[] args) {
    
    MathOperation mO = new MathOperation();
    
    mO.addition(34, 23);
    mO.subtraction(76, 34);
    mO.muiltiplication(56, 54);
    mO.division(42, 2);
    mO.division(120, 0);

  }

}

package com.codingblackfemales;

public class Calculator {
    public static Integer add(final int firstInput, final int secondInput) {
        return firstInput + secondInput;
    }

    public static Integer subtract(final int firstInput, final int secondInput) {
        return firstInput - secondInput;
    }

    public static Integer multiply(final int firstInput, final int secondInput) {
        return firstInput * secondInput;
    }

   // added a conditiotinal check to the divide method to handle division by zero and throw in an ArithmeticException with an error message
   public static Integer divide(final int firstInput, final int secondInput) {
    if (secondInput == 0) {
        throw new ArithmeticException("Division by zero is not allowed");
    }
    return firstInput / secondInput;
    }  
    
}

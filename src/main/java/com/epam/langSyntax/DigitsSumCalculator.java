package com.epam.langSyntax;

public class DigitsSumCalculator {
 public void calculateSum(int number) {
    int result = 0;
	    result += number%10;
	     number = number/10;
	    result += number%10;
	     number = number/10;
	     result += number%10;
	     number = number/10;
	     result += number%10;
	     number = number/10;
	    System.out.println(result);
    }


}

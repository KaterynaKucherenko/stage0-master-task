package com.epam.loops;

public class Pyramid {

   public void printPyramid(int cathetusLength) {
 for(int i=1; i<=cathetusLength; i++){
	      int x=i;
	       for (int j=i; j<=cathetusLength; j++){
	           System.out.print(" ");}
	       for (int j=1; j<=i; j++){
	            System.out.print(x--);}
	       for (int j=2; j<=i; j++){
	           System.out.print(j);}
	        System.out.println();}
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}

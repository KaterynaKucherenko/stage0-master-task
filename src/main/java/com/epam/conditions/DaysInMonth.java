package com.epam.conditions;

public class DaysInMonth {

public void printDays(int year, int month) {
if (month <= 0 || month >=13 || year <=0){
	        System.out.println("invalid date");
	    }
	    if(month == 2){
	        if ((year %400 == 0) || ((year%100 != 0) && (year%4 ==0) )){
	            System.out.println(29);}
	            else{
	                System.out.println(28);}
	            }
	            else{
	    if (month > 0 && month <13  ){
	            if ( month == 4 || month == 6 || month == 9 || month ==11){
	                System.out.println(30);}
	                else{
	                    System.out.println(31);
	                }}}

    }

    

}

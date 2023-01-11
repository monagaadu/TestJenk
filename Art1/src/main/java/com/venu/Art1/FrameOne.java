/*
 Put header here
 */
package com.venu.Art1;

import java.util.Arrays;

public class FrameOne {

    		  public static void main(String[] args) {

    		    // positive number
    		    int number = 90;

    		    System.out.print("Factors of " + number + " are: ");

    		    // loop runs from 1 to 60
    		    for (int i = 1; i <= number; ++i) {

    		      // if number is divided by i
    		      // i is the factor
    		      if (number % i == 0) {
    		        System.out.print(i + " ");
    		      }
    		    }
    		    int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};
    		    System.out.println();
    	        System.out.println(Arrays.deepToString(array));
    		  }
    		 
    }
package com.spaceship.member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSequence {
	
	public static void main(String[] args) {
	    int [] input_test1 = {1, 1 ,2, 3, 1};
	    System.out.println(array123(input_test1));

	    int [] input_test2 = {1,1,2,4,1};
	    System.out.println(array123(input_test2));
	    
	    int [] input_test3 = {1,1,2,1,2,3};
	    System.out.println(array123(input_test3));
	    
	}

	public static boolean array123(int[] input) {
		
	    for(int i = 0; i < input.length - 2; i++) {
	       if(input[i] == 1 && input[i + 1] == 2 && input[i + 2] == 3){
	           return true;
	       }
	   }
	   return false;
	}

}

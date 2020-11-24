package com.spaceship.member;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int [] input_test1 = {2,2,2,2,2,2};
	    System.out.println(remove_duplicates(input_test1));

	    int [] input_test2 = {1,2,2,3,4,4,4,4,5,5};
	    System.out.println(remove_duplicates(input_test2));

	}
	
	public static Set<Integer> remove_duplicates(int[] input) {
		return  Arrays.stream(input).distinct().boxed().collect(Collectors.toSet()) ;
		
	}

}

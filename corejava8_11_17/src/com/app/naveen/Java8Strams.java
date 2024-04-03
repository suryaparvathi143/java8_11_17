package com.app.naveen;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Strams {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(8,5,5,2);
		
		//Given a list of integers, write a Java program to find the product of all the integers using the reduce operation.
		Integer i=integerList.stream().reduce(0,(a,b)->a+b);
		System.out.println(i);
		
		//Given a large list of integers, write a Java program to find the sum of all the integers using parallel streams to improve performance.
		int sum=integerList .stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		int sum2=integerList.parallelStream().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		//Convert String of array to Upper case		
		List<String> stringList=List.of("Hello","World");
		stringList.stream().map(x->x.toUpperCase()).forEach(System.out::println);
		
	}
}

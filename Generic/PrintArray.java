package com.Bridgelabz.Generic;

public class PrintArray {
	
	 public static void toPrint(Integer[] inputArray) {
		 for(int element : inputArray) {
			 System.out.println(element);
		 }
		 System.out.println();
	 }
	 
	 public static void toPrint(Double[] inputArray) {
		 for(double element : inputArray) {
			 System.out.println(element);
		 }
		 System.out.println();
	 }
	 
	 public static void toPrint(Character[] inputArray) {
		 for(char element : inputArray) {
			 System.out.println(element);
		 }
		 System.out.println();
	 }
	
	public static void main(String[] args) {
	Integer[] intArray = {1, 2, 3, 4, 5};
	Double[] doubleArray =  {1.1, 2.2, 3.3, 4.4, 5.5};
	Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
	
	PrintArray.toPrint(intArray);
	PrintArray.toPrint(doubleArray);
	PrintArray.toPrint(charArray);
	}
}

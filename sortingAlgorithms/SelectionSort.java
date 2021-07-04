package sortingAlgorithms;

import java.io.*;
import java.util.*;
import java.lang.*;

public class SelectionSort {
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int[] array = new int[input.length];
		int index =0 ;
		for (String x : input ){
			array[index] = Integer.parseInt(x);
			index++;
		}
		selectionSort(array);
		printArray(array);
		
	}
	
	public static void selectionSort(int[] array){
		int outerIndex = 0; 
		int innerIndex = 1; 
		int smallestIndex = 0;
		while (outerIndex < array.length){
			int outer = array[outerIndex];
			smallestIndex = outerIndex;
			innerIndex = outerIndex + 1;
			while (innerIndex < array.length){
				if (outer > array[innerIndex]){
					outer = array[innerIndex];
					smallestIndex = innerIndex; 
				}
				innerIndex++;
			}
			int temp = array[outerIndex];
			array[outerIndex] = outer;
			array[smallestIndex] = temp;
			outerIndex++;
		}
	}
	
	public static void printArray(int[] array){
		for (int x : array){
			System.out.println(x);
		}
	}

}

package sortingAlgorithms;

import java.io.*;
import java.lang.*;
import java.util.*;


public class InsertionSort {
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int[] array = new int[input.length];
		int index =0 ;
		for (String x : input ){
			array[index] = Integer.parseInt(x);
			index++;
		}
		insertionSort(array);
		printArray(array);
	}
	
	
	public static void insertionSort(int[] array){
		int index = 0;
		while (index < array.length){
			int backIndex = index-1;
			int value = array[index];
			int frontIndex = index;
			while (backIndex>=0){
				if (value< array[backIndex]){
					array[frontIndex] = array[backIndex];
					array[backIndex] = value;
					backIndex--;
					frontIndex--;
				}
				else{
					break;
				}
					
			}
			index++;
		}
	}
	
	
	public static void printArray(int[] array){
		for (int x : array){
			System.out.println(x);
		}
	}


}

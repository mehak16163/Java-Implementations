package sortingAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSort {
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int[] array = new int[input.length];
		int index =0 ;
		for (String x : input ){
			array[index] = Integer.parseInt(x);
			index++;
		}
		quickSort(array , 0 , array.length-1);
		printArray(array);
	}
	
	
	public static void quickSort(int[] array, int l , int r){
		if (l>=r){
			return;
		}
		int pivot = array[r];
		int i = l-1;
		int j = l;
		while (j<=r){
			if (array[j]>pivot){
				j++;
				continue;
			}
			else{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			j++;
		}
		quickSort(array, l, i-1);
		quickSort(array , i+1 , r);
	}
	
	
	public static void printArray(int[] array){
		for (int x : array){
			System.out.println(x);
		}
	}

}

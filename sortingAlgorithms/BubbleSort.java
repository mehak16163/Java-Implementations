package sortingAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int[] array = new int[input.length];
		int index =0 ;
		for (String x : input ){
			array[index] = Integer.parseInt(x);
			index++;
		}
		bubbleSort(array);
		printArray(array);

	}

	public static void bubbleSort(int[] array){
		boolean swap = true;

		while (swap){
			int first = 0;
			int second = 1;
			swap = false;
			while (second < array.length){
				if (array[first] > array[second]){
					int temp = array[first];
					array[first] = array[second];
					array[second] = temp;
					swap = true;
				}
				first++;
				second++;
			}
		}

	}

	public static void printArray(int[] array){
		for (int x : array){
			System.out.println(x);
		}
	}


}

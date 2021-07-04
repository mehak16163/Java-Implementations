package sortingAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MergeSort {
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String[] input = rd.readLine().split(" ");
		int[] array = new int[input.length];
		int index =0 ;
		for (String x : input ){
			array[index] = Integer.parseInt(x);
			index++;
		}
		array = mergeSort(array , 0 , array.length-1);
		printArray(array);
	}
	
	
	public static int[]  mergeSort(int[] array , int l , int r){
		if (l>=r){
			return array;
		}
		mergeSort(array , l , (l+r)/2);
		mergeSort(array , ((l+r)/2)+1, r);
		return merge(array , l  ,(l+r)/2, ((l+r)/2)+1, r);
	}
	
	public static int[] merge(int[] array , int l1, int r1, int l2, int r2){
		int[] n1 = new int[r1-l1 + 1];
		int[] n2 = new int[r2-l2+1];
		for (int i = l1 ; i<=r1; i++){
			n1[i-l1] = array[i];
		}
		
		for (int i=l2 ;i<=r2; i++){
			n2[i-l2] = array[i];
		}
		
		int index1 = 0; 
		int index2 = 0;
		int index = l1;
		
		
		while (index1<n1.length && index2<n2.length){
			if (n1[index1]< n2[index2]){
				array[index] = n1[index1];
				index1++;
			}
			else{
				array[index] = n2[index2];
				index2++;
			}
			index++;
		}
		
		while (index1<n1.length){
			array[index] = n1[index1];
			index++;
			index1++;
		}
		
		while (index2<n2.length){
			array[index] = n2[index2];
			index++;
			index2++;
		}
		
		
		return array;
	}
	
	
	public static void printArray(int[] array){
		for (int x : array){
			System.out.println(x);
		}
	}



}

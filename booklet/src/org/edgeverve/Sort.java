package org.edgeverve;

import java.util.Arrays;
import java.util.List;

public class Sort {
	
	static void  quickSort(int list[],int first,int last){
	    int pivot,i,j,temp;

	     if(first < last){
	         pivot = first;
	         i = first;
	         j = last;

	         while(i < j){
	             while(list[i] <= list[pivot] && i < last)
	                 i++;
	             while(list[j] > list[pivot] && j > first)
	                 j--;
	             if(i < j){
	                  temp = list[i];
	                  list[i] = list[j];
	                  list[j] = temp;
	             }
	         }

	         temp = list[pivot];
	         list[pivot] = list[j];
	         list[j] = temp;
	         quickSort(list,first,j-1);
	         quickSort(list,j+1,last);
	    }
	}
	
	public static void main(String[] args) {
		int arr[] = {54, 84,74,14,25,18,79,84};
		quickSort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	
}

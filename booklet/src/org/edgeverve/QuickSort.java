package org.edgeverve;

import java.util.Arrays;

public class QuickSort {
	
	public static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = partition(arr, low, high);
			quicksort(arr,low, mid-1);
			quicksort(arr, mid+1, high);
		}
	}
	
	public static int partition(int arr[], int low, int high) {
		int pivot = low;
		int i = low, j = high;
		while(i < j) {
			while(arr[pivot] < arr[i]) {
				i++;
			}
			while(arr[j] > arr[pivot]) {
				j--;
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;
		pivot = j;
		return pivot;
	}
	
	public static void main(String[] args) {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		quicksort(arr, 0, arr.length-1);
		Arrays.stream(arr).forEach(System.out::println);
	}

}

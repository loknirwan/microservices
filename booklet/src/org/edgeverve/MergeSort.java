package org.edgeverve;

public class MergeSort {

	public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
		
	}
	
	public static void mergeSort(int arr[], int temp[], int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, temp, low, mid);
			mergeSort(arr, temp, mid+1, high);
			merge(arr, temp, low,mid, high);
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}

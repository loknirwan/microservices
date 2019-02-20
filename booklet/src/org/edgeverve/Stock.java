package org.edgeverve;

import java.util.Arrays;

public class Stock {

	public static void main(String[] args) {
		//bubbleSort();
		//selection();
		insertion();
	}
	
	public static void bubbleSort() {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void selection() {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1, 16 , 24};
		
		for(int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				} 
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	public static void insertion() {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1, 16 , 24};
		for(int i = 1; i<arr.length; i++) {
			int k = i;
			while(k > 0) {
				if(arr[k] < arr[k-1]) {
					int temp = arr[k];
					arr[k] = arr[k-1];
					arr[k-1] = temp;
				}
				k--;
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
	
	
	public static void heapsort() {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		int[] heap = buildHeap(arr);
	}
	
	public static int[] buildHeap(int arr[]) {
		int[] heap = new int[arr.length+1];
		heap[0] = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			heap[i+1] = arr[i];
			percolateUp(heap, i+1);
		}
		return heap;
	}
	
	public static void percolateUp(int[] heap, int i) {
		int parent = i/2;
		if(parent == 0)
			return;
		else {
			
		}
	}
	
	public static void percolateDown(int[] heap) {
		
	}
	
	
	
	public static void pramati() {
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		int maxDiff = -1;
		int lmin[] = new int[arr.length];
		int rmax[] = new int[arr.length];
		
		lmin[0] = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			lmin[i] = Math.min(arr[i], lmin[i-1]);
		}
		
		rmax[rmax.length - 1] = arr[arr.length - 1];
		
		for(int i=arr.length-2; i>=0; i--) {
			rmax[i] = Math.max(arr[i], rmax[i+1]);
		}
		
		System.out.println();
		
		int i=0, j=0;
		while(i < lmin.length && j < rmax.length) {
			if(lmin[i] < rmax[j]) {
				maxDiff = Math.max(maxDiff, j-i);
				j++;
			} else {
				i++;
			}
		}
		System.out.println(maxDiff);
	
	}
	
}

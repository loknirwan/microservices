package org.edgeverve;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Pattern {
	
	private static boolean isPower(int num) {
		boolean flag = false;
		if(num==1 || num ==0) {
			flag = true;
		}
		for(int i=2; i*i<=num; i++) {
			double val = Math.log(num) / Math.log(i);
			if((val - (int)val)<0.00000001) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter start of the range:");
		int start = scanner.nextInt();
		System.out.print("Enter end of the range:");
		int end = scanner.nextInt();
		long startTime  = System.currentTimeMillis();
		long count = IntStream.range(start, end).parallel().filter(num->{
			boolean flag = false;
			for(int i=num/2; i>=0; i--) {
				if(isPower(num-i) && isPower(i)) {
					flag = true;
					break;
				}
			}
			return flag;
		}).count();
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println(count);
	}
	
	
}

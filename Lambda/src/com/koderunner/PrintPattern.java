package com.koderunner;

public class PrintPattern {

	public static void main(String[] args) {

		//printPattern1();

		printPattern2();

	}

	private static void printPattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > 0; j--)
				System.out.print(j);
			System.out.println();
		}
	}

	private static void printPattern2() {
		for(int i=1; i<=5;i++){
			for(int j=5-i;j>0;j--)
				System.out.print(" ");
			for(int k=i;k>0;k--)
				System.out.print(i);
			System.out.println();
		}
	}
}

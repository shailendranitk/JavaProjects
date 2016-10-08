package com.koderunner;

public class PrintPattern6 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--)
				System.out.print(" ");
			for (int k = 5 - i; k <= 5; k++)
				System.out.print(k);
			for (int n = 5 - i, m = 5 - 1; n < 5; n++, m--)
				System.out.print(m);
			System.out.println();
		}
	}
}

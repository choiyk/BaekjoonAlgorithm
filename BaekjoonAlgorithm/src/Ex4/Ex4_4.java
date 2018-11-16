package Ex4;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int n = scan.nextInt();
			double[] a = new double[n];
			double big=0.0;
			double sum = 0.0;
			for(int i=0; i<n; i++) {
				a[i] = scan.nextDouble();
				big = big < a[i] ? a[i] : big;
			}
			for(int i=0; i<n; i++)
				sum += a[i]/big*100;
			System.out.println(sum/n);
		}
	}

}

package Ex4;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int n = scan.nextInt();
			scan.nextLine();
			for(int i=0; i<n; i++) {
				int std = scan.nextInt();
				int sum = 0;
				int[] score = new int[std];
				for(int j=0; j<std; j++) {
					score[j] = scan.nextInt();
					sum += score[j];
				}
				double avg = sum/std;
				int topNum = 0;
				for(int j=0; j<std; j++) {
					if(score[j]>avg) topNum++;
				}
				double topRatio = (double)topNum/std*100;
				System.out.println(String.format("%.3f", topRatio));
			}
		}
	}

}

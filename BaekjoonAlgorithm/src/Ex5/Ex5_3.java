package Ex5;

import java.util.Scanner;

public class Ex5_3 {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++)
				sb.append(" ");
		}
	}

}

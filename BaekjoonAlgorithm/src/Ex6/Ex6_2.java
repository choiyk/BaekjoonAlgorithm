package Ex6;

import java.util.Scanner;

public class Ex6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String result = Integer.toString(a*b*c);//17037300
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<result.length(); i++) {
			int n = Integer.parseInt(String.valueOf(result.charAt(i)));
			arr[n]++;
		}
		for(int i=0; i<10; i++)
			System.out.println(arr[i]);
	}

}

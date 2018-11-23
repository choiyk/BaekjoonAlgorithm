package Ex5;

import java.util.Scanner;

public class Ex5_2 {
	static int count = 0;

	public static void hanSoo(int n) {
		int a,b,c,d;
		a = n/100;//100
		b = n%100;
		c = b/10;//10
		d = b%10;//1
		if(c-(a-c) == d)
			count++;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	//1000(X) 999
		for(int i=1; i<=n; i++) {
			if(i<100) count++;
			else hanSoo(i);
		}
		System.out.println(count);
	}

}

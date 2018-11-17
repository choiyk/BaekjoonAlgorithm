package Ex4;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num = scan.nextInt();
			int result = num;
			int a, b, c;
			int cycle=0;
			while(true) {
				a = result/10;
				b = result%10;
				c = a+b;
				result = (b*10)+(c%10);
				cycle++;
				if(result == num) break;
			}
			System.out.println(cycle);
		}
	}

}

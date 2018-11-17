package Ex4;

import java.util.Scanner;

public class Ex4_6_1 {

	public static int add(int num, int result, int count) {
		int a, b;
		a = result/10;
		b = result%10;
		result = (b*10)+((a+b)%10);
		if(result == num) return ++count;
		else return add(num, result, ++count);
	}

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num = scan.nextInt();
			System.out.println(add(num, num, 0));
		}
	}

}

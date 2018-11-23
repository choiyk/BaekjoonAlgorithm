package Ex5;

public class Ex5_1 {

	public static int selfNum(int n) {
		int a,b,c,d;
		a = n/1000;//9
		b = n%1000;//999
		c = b/100;//9
		d = b%100;//99
		return n+a+c+(d/10)+(d%10);
	}

	public static void main(String[] args) {
		int[] arr = new int[10001];
		for(int i=1; i<=10000; i++) {
			int result = selfNum(i);
			if(result <= 10000)
				arr[result] = 1;
		}
		for(int i=1; i<=10000;i++) {
			if(arr[i]!=1)
				System.out.println(i);
		}
	}

}

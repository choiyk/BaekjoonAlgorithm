package Ex3;
import java.util.Scanner;
public class Ex3_8{
    public static void main(String[] args){
        int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		Scanner scan = new Scanner(System.in);
		int mon = scan.nextInt();
		int date_num = scan.nextInt();
		for(int i=0; i<mon-1; i++)
			date_num += date[i];
		System.out.println(day[date_num % 7]);
        scan.close();
    }
}

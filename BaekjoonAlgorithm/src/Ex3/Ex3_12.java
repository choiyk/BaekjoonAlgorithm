package Ex3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_12{
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int line, a, b;
		try{
			line = Integer.parseInt(br.readLine());
			while(line>0){
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				sb.append(a+b);
				sb.append("\n");
				--line;
			}
		} catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(sb);
    }
}
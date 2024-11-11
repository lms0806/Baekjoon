import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int min = Math.abs(a - b);
		
		int n = Integer.parseInt(br.readLine());
		
		boolean flag = false;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(Math.abs(num - b) < min) {
				min = Math.abs(num - b);
				flag = true;
				a = num;
			}
		}
		
		System.out.print(min + (flag ? 1 : 0));
	}
}

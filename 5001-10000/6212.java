import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int[] num = new int[10];
		
		for(int i = a; i <= b; i++) {
			int n = i;
			
			while(n != 0) {
				num[n % 10]++;
				n /= 10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : num) {
			sb.append(n).append(" ");
		}
		System.out.print(sb);
	}
}

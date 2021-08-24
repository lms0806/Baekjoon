import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			num[i] = num[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= n - k; i++) {
			max = Math.max(max, num[i + k] - num[i]);
		}
		System.out.print(max);
	}
}

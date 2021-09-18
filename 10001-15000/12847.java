import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0, answer = 0;
		for(int i = 0; i < n; i++) {
			if(i >= m) {
				sum -= num[i - m];
			}
			sum += num[i];
			
			if(sum > answer) {
				answer = sum;
			}
		}
		System.out.print(answer);
	}
}

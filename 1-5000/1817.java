import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		if(n == 0) {
			System.out.print(0);
			return;
		}
		
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 1, sum = 0;
		for(int i = n - 1; i >= 0; i--) {
			sum += num[i];
			if(sum > m) {
				answer++;
				sum = num[i];
			}
		}
		System.out.print(answer);
	}
}

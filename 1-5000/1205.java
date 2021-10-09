import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		if(n == 0) {
			System.out.print(1);
			return;
		}
		
		int score = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		if(n == p && num[n - 1] >= score) {
			System.out.print(-1);
			return;
		}
		int rank = 1;
		for(int i = 0; i < n; i++) {
			if(num[i] > score) {
				rank++;
			}
		}
		System.out.print(rank);
	}
}

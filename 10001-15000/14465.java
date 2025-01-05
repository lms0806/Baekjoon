import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[n + 1];
		
		while(b --> 0) {
			check[Integer.parseInt(br.readLine())] = true;
		}

		int count = 0;
		for(int i = 1; i <= k; i++) {
			if(check[i]) {
				count++;
			}
		}
		
		int answer = count;
		for(int i = 1; i < n - k + 1; i++) {
			if(check[i]) {
				count--;
			}
			if(check[i + k]) {
				count++;
			}
			answer = Math.min(answer, count);
		}
		System.out.print(answer);
	}
}

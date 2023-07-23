import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n * m + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n * m + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
		}
		
		int answer = 0;
		for(int i = m; i < n * m + 1; i += m) {
			if(m - (arr[i] - arr[i - m]) < p) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

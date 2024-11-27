import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long[] l = new long[10001], r = new long[10001];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			l[Integer.parseInt(st.nextToken())]++;
		}
		for(int i = 0; i < n; i++) {
			r[Integer.parseInt(st.nextToken())]++;
		}
		
		long answer = n * n;
		for(int i = 1; i <= k; i++) {
			answer -= l[i] * r[i];
		}
		System.out.print(answer);
	}
}

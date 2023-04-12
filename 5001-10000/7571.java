import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[m], b = new int[m];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int aa = a[m / 2], ab = b[m / 2];
		int answer = 0;
		for(int i = 0; i < m; i++) {
			answer += Math.abs(aa - a[i]);
			answer += Math.abs(ab - b[i]);
		}

		System.out.print(answer);
	}
}

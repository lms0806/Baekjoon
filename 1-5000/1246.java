import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] p = new int[m];
		for(int i = 0; i < m; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(p);
		
		int result = 0, max = 0, price = 0;
		for(int i = 0; i < m; i++) {
			result = p[i] * (m - i < n ? m - i : n);
			
			if(max < result) {
				price = p[i];
				max = result;
			}
		}
		System.out.print(price + " " + max);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		
		int min = b;
		while(h --> 0) {
			int cost = Integer.parseInt(br.readLine());
			
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < w; i++) {
				int p = Integer.parseInt(st.nextToken());
				if(p >= n) {
					sum = cost * n;
				}
			}
			
			if(min > sum && sum != 0) {
				min = sum;
			}
		}
		
		System.out.print(min >= b ? "stay home" : min);
	}
}

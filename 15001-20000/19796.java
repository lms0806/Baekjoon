import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[n + 1];
		
		int count = 0;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			for(int i = a; i <= b; i++) {
				if(!check[i]) {
					check[i] = true;
					count++;
				}
			}
		}
		
		System.out.print(n - count == 0 ? "YES" : "NO");
	}
}

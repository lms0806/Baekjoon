import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) - 2;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		for(int i = 0; i < n; i++) {
			st.nextToken();
		}
		int b = Integer.parseInt(st.nextToken());
		
		while(n --> 1) {
			if(a > b) {
				a--;
			}
			else {
				b--;
			}
		}
		System.out.print(Math.max(a, b) - 1);
	}
}

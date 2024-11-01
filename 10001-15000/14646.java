import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[n + 1];
		
		n <<= 1;
		
		int answer = 0, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(check[num]) {
				count--;
			}
			else {
				check[num] = true;
				answer = Math.max(answer, ++count);
			}
		}
		System.out.print(answer);
	}
}

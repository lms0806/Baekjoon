import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[1002];
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			check[Integer.parseInt(st.nextToken())] = true;
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 1; i < 52; i++) {
			if(check[i]) {
				continue;
			}
			
			for(int j = 1; j < 52; j++) {
				if(check[j]) {
					continue;
				}
				
				for(int k = 1; k < 1002; k++) {
					if(check[k]) {
						continue;
					}
					
					answer = Math.min(answer, Math.abs(n - i * j * k));
					
					if(i * j * k > n) {
						break;
					}
				}
			}
		}
		System.out.print(answer);
	}
}

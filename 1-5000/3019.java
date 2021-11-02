import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		int[] n = new int[c];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < c; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		if(p == 1) {
			for(int i = 0; i < c - 3; i++) {
				if(n[i] == n[i + 1] && n[i + 1] == n[i + 2] && n[i + 2] == n[i + 3]) {
					answer++;
				}
			}
			answer += c;
		}
		
		if(p == 2) {
			for(int i = 0; i < c - 1; i++) {
				if(n[i] == n[i + 1]) {
					answer++;
				}
			}
		}
		
		if(p == 3) {
			for(int i = 0; i < c - 2; i++) {
				if(n[i] == n[i + 1] && n[i + 1] == n[i + 2] - 1) {
					answer++;
				}
			}
			
			for(int i = 0; i < c - 1; i++) {
				if(n[i] - 1 == n[i + 1]) {
					answer++;
				}
			}
		}
		
		if(p == 4) {
			for(int i = 0; i < c - 2; i++) {
				if(n[i] - 1 == n[i + 1] && n[i + 1] == n[i + 2]) {
					answer++;
				}
			}
			
			for(int i = 0; i < c - 1; i++) {
				if(n[i] == n[i + 1] - 1) {
					answer++;
				}
			}
		}
		
		if(p == 5) {
			for(int i = 0; i < c - 2; i++) {
				if(n[i] == n[i + 1] && n[i + 1] == n[i + 2]) {
					answer++;
				}
				if(n[i] - 1 == n[i + 1] && n[i + 1] == n[i + 2] - 1) {
					answer++;
				}
			}
			
			for(int i = 0; i < c - 1; i++) {
				if(n[i] == n[i + 1] - 1 || n[i] - 1 == n[i + 1]) {
					answer++;
				}
			}
		}
		
		if(p == 6) {
			for(int i = 0; i < c - 2; i++) {
				if(n[i + 1] == n[i + 2] && (n[i] + 1 == n[i + 1] || n[i] == n[i + 1])) {
					answer++;
				}
			}
			
			for(int i = 0; i < c - 1; i++) {
				if(n[i] == n[i + 1] || n[i] - 2 == n[i + 1]) {
					answer++;
				}
			}
		}
		
		if(p == 7) {
			for(int i = 0; i < c - 2; i++) {
				if(n[i] == n[i + 1] && (n[i + 1] == n[i + 2] || n[i + 1] == n[i + 2] + 1)) {
					answer++;
				}
			}
			
			for(int i = 0; i < c - 1; i++) {
				if(n[i] == n[i + 1] || n[i] == n[i + 1] - 2) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(n --> 0) {
			boolean[] alpha = new boolean[26];
			boolean flag = true;
			for(char c : br.readLine().toCharArray()) {
				if(c - 'A' >= m || alpha[c - 'A']) {
					flag = false;
					break;
				}
				alpha[c - 'A'] = true;
			}
			
			if(flag) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

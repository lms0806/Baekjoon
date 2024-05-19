import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		int count = 0;
		boolean[] alpha = new boolean[26];
		StringBuilder sb = new StringBuilder();
		for(char c : st.nextToken().toCharArray()) {
			if(alpha[c - 'a']) {
				count++;
				continue;
			}
			
			alpha[c - 'a'] = true;
			sb.append(c);
		}
		sb.append(count + 4);
		
		sb = new StringBuilder((1906 + num) + sb.toString());
		sb = sb.reverse();
		
		System.out.print("smupc_" + sb);
	}
}

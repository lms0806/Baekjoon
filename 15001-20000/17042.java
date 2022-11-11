import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0);
		
		int t = Integer.parseInt(br.readLine().trim());
		
		boolean[] alpha = new boolean[26];
		alpha[c - 'A'] = true;
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0), b = st.nextToken().charAt(0);
			
			if(b == c) {
				alpha[a - 'A'] = true;
				c = a;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i]) {
				answer++;
			}
		}
		System.out.print(c + "\n" + answer);
	}
}

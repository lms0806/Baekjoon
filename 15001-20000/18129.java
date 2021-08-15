import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken().toLowerCase() + ' ';
		int n = Integer.parseInt(st.nextToken());
		
		boolean[] alpha = new boolean[26];
		
		char c = s.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(ch == c) {
				count++;
			}
			else {
				if(!alpha[c - 'a']) {
					sb.append(count >= n ? 1 : 0);
					alpha[c - 'a'] = true;
				}
				
				c = ch;
				count = 1;
			}
		}
		
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			int[] alpha = new int[26];
			
			for(char ch : b.toCharArray()) {
				if(alpha[ch - 'A'] == 0) {
					alpha[ch - 'A']++;
				}
			}
			
			for(char ch : a.toCharArray()) {
				if(alpha[ch - 'A'] > 0) {
					alpha[ch - 'A'] = 0;
				}
				else {
					alpha[ch - 'A']--;
				}
			}
			
			sb.append(check(alpha)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String check(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				return "NO";
			}
		}
		return "YES";
	}
}

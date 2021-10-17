import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken(), s1 = st.nextToken();
			
			int k = 0;
			sb.append("Ciphertext: ");
			for(char ch : s1.toCharArray()) {
				char c = (char)(ch - 'A' + s.charAt(k));
				if(c > 'Z') {
					c -= 26;
				}
				sb.append(c);
				
				k++;
				if(k == s.length()) {
					k = 0;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

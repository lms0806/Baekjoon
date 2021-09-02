import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int start = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(start <= i + 1) {
				sb.append(ch >= 'A' && ch <= 'Z' ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.print(sb);
	}
}

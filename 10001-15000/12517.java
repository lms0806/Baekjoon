import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			String s = br.readLine().trim();
			
			sb.append("Case #").append(i).append(": ").append(s).append(" is ruled by ");
			char ch = s.charAt(s.length() - 1);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sb.append("a queen");
			}
			else {
				sb.append(ch == 'y' ? "nobody" : "a king");
			}
			sb.append(".\n");
		}
		System.out.print(sb);
	}	
}

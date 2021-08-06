import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if(n == 0) {
				break;
			}
			
			String s = "";
			for(char ch : st.nextToken().toCharArray()) {
				if((ch - '0' != n && ch != '0') || (s.length() == 0 && ch == '0')) {
					s += ch;
				}
			}
			sb.append(s.equals("") ? "0" : s).append("\n");
		}
		System.out.print(sb);
	}
}

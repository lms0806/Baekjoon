import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int answer = 0;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch != ' ') {
					answer += (ch - 'A' + 1) * (i + 1);
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

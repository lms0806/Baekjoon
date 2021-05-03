import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int count = 0;
			String answer = "";
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			for(int i = 0; i < s.length()-1; i++) {
				char ch = s.charAt(i);
				if(ch == '1') {
					count++;
				}
				answer += ch;
			}
			
			sb.append(answer).append(s.charAt(s.length()-1) == 'e' ? count%2 == 0 ? "0" : "1" : count%2 == 0 ? "1" : "0").append("\n");
		}
		System.out.print(sb);
	}
}

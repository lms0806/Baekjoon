import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int answer = 0, max = 0;
			for(int i = 0; i < 26; i++) {
				int count = 0;
				
				for(char c : s.toCharArray()) {
					if(c != ' ') {
						if(((char)(c - i) < 'A' ? (char)(c - i + 26) : (char)(c - i)) == 'E') {
							count++;
						}
					}
				}
				
				if(max < count) {
					max = count;
					answer = i;
				}
				else if(max == count) {
					answer = -1;
				}
			}
			
			if(answer == -1) {
				sb.append("NOT POSSIBLE");
			}
			else {
				sb.append(answer).append(" ");
				for(char c : s.toCharArray()) {
					sb.append(c == ' ' ? c : (char)(c - answer) < 'A' ? (char)(c - answer + 26) : (char)(c - answer));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

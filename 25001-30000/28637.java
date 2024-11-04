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
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				
				if('A' <= c && c <= 'Z') {
					if(i != 0) {
						sb.append("_");
					}
					sb.append((char)(c - 'A' + 'a'));
				}
				else {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			for(char c : s.toCharArray()) {
				if(flag) {
					if(c >= 'a' && c <= 'z') {
						sb.append((char)(c - 'a' + 'A'));
						flag = false;
						continue;
					}
					else if(c != ' ') {
						flag = false;
					}
				}
				else if(c >= 'A' && c <= 'Z') {
					sb.append((char)(c - 'A' + 'a'));
					continue;
				}
				
				if(c == '?' || c == '.' || c == '!' || c == '(' || c == ')') {
					flag = true;
				}
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

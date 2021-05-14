import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken())%26;
		st.nextToken();
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ' || ch == '.' || ch == ',') {
				sb.append(ch);
			}
			else {
				int num = 0;
				if(ch >= 'a' && ch <= 'z') {
					num = ch+size <= 'z' ? ch+size : ch+size-26;
				}
				else if(ch >= 'A' && ch <= 'Z'){
					num = ch+size <= 'Z' ? ch+size : ch+size-26;
				}
				sb.append((char)num);
			}
		}
		System.out.print(sb);
	}
}

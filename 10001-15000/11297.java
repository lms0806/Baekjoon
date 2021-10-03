import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a == 0 || b == 0 || c == 0) {
				break;
			}
			
			int num = (a + b + c) % 25 + 1;
			
			for(char ch : br.readLine().toCharArray()) {
				if('a' <= ch && ch <= 'z') {
					ch -= num;
					if(ch < 'a') {
						ch += 26;
					}
				}
				sb.append(ch);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

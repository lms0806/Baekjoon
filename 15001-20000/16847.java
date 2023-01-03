import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			char[] ch = br.readLine().toCharArray();
			
			int answer = 0;
			while(n --> 0) {
				String s = br.readLine();
				
				for(int j = 0; j < s.length(); j++) {
					if(ch[j] != ' ' && ch[j] == s.charAt(j)) {
						ch[j] = ' ';
						answer++;
					}
				}
			}
			
			sb.append("Data Set ").append(i).append(":").append("\n");
			sb.append(ch.length - answer).append("/").append(ch.length).append("\n\n");
		}
		System.out.print(sb);
	}
}

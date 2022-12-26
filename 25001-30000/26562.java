import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] str = {"Franklin", "Grant", "Jackson", "Hamilton", "Lincoln", "Washington"};
		int[] num = {100, 50, 20, 10, 5, 1};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int answer = 0;
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				
				for(int i = 0; i < str.length; i++) {
					if(s.equals(str[i])) {
						answer += num[i];
						break;
					}
				}
			}
			sb.append("$").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

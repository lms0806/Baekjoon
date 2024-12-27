import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), size = Integer.parseInt(st.nextToken());
		
		String[] str = new String[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
			
			sum += str[i].length();
		}
		
		int blank = (size - sum) / (n - 1);
		int remainBlank = size - sum - (blank * (n - 1));
		
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]);
		for(int i = 1; i < str.length; i++) {
			if(('a' <= str[i].charAt(0) && str[i].charAt(0) <= 'z' && remainBlank > 0) || (i + remainBlank == n)) {
				remainBlank--;
				sb.append("_".repeat(blank + 1));
			}
			else {
				sb.append("_".repeat(blank));
			}
			sb.append(str[i]);
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
			
			max = Math.max(max, s[i].length());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < max; i++) {
			int sum = 0, count = 0;
			for(int j = 0; j < n; j++) {
				if(i >= s[j].length()) {
					continue;
				}
				
				sum += s[j].charAt(i);
				count++;
			}
			
			sb.append((char)(sum / count));
		}
		System.out.print(sb);
	}
}

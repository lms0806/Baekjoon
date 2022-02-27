import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			String[] strs = new String[n];
			
			for(int j = 0; j < n; j++) {
				strs[j] = br.readLine();
			}
			
			String s = br.readLine().toLowerCase();
			
			sb.append("Data Set ").append(i).append(":").append("\n");
			for(int j = 0; j < n; j++) {
				int idx = 0;
				for(int k = 0; k < strs[j].length(); k++) {
					char c = strs[j].charAt(k);
					
					if(c >= 'a' && c <= 'z') {
						if(c == s.charAt(idx)) {
							idx++;
						}
					}
					else if(c >= 'A' && c <= 'Z') {
						c += 32;
						if(c == s.charAt(idx)) {
							idx++;
						}
					}
					if(idx == s.length()) {
						sb.append(strs[j]).append("\n");
						break;
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

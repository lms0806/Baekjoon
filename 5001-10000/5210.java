import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			String[] s = new String[n];
			for(int j = 0; j < n; j++) {
				s[j] = br.readLine();
			}
			
			String str = br.readLine().toUpperCase();
			
			sb.append("Data Set ").append(i).append(":").append("\n");
			for(int j = 0; j < n; j++) {
				int idx = 0;
				String si = s[j].toUpperCase();
				for(int k = 0; k < si.length(); k++) {
					if(si.charAt(k) == str.charAt(idx)) {
						idx++;
					}
					
					if(idx == str.length()) {
						sb.append(s[j]).append("\n");
						break;
					}
				}
			}
		}
		System.out.print(sb);
	}
}

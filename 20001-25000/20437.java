import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			int k = Integer.parseInt(br.readLine());
			
			if(k == 1) {
				sb.append(1).append(" ").append(1).append("\n");
				continue;
			}
			
			int[] alpha = new int[26];
			for(char c : str.toCharArray()) {
				alpha[c - 'a']++;
			}
			
			int s = Integer.MAX_VALUE, e = -1;
			for(int i = 0; i < str.length(); i++) {
				if(alpha[str.charAt(i) - 'a'] < k) {
					continue;
				}
				
				int count = 1;
				for(int j = i + 1; j < str.length(); j++) {
					if(str.charAt(i) == str.charAt(j)) {
						count++;
					}
					
					if(count == k) {
						s = Math.min(s, j - i + 1);
						e = Math.max(e, j - i + 1);
						break;
					}
				}
			}
			sb.append(s == Integer.MAX_VALUE && e == -1 ? -1 : s + " " + e).append("\n");
		}
		System.out.print(sb);
	}
}

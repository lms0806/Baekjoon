import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int[] alpha = new int[26];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(i < k) {
				sb.append(c);
			}
			else {				
				int max = 0, num = 0;
				for(int j = 0; j < 26; j++) {
					if(max < alpha[j]) {
						max = alpha[j];
						num = j + 1;
					}
				}
				
				c += num;
				
				if(c > 'z') {
					c -= 26;
				}
				
				sb.append(c);
				alpha[s.charAt(i - k) - 'a']--;
			}

			alpha[s.charAt(i) - 'a']++;
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = {"", ".,!? ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int idx = 0, num = -1;
			
			StringBuilder result = new StringBuilder();
			for(char c : br.readLine().toCharArray()) {
				int choice = c - '0';
				
				if(num == -1) {
					idx = choice;
					num = 0;
				}
				else {
					if(choice == 0) {
						if(idx != 0) {
							result.append(s[idx].charAt(num));
						}
						idx = 0;
						num = -1;
					}
					else if(idx != choice) {
						if(idx != 0) {
							result.append(s[idx].charAt(num));
						}
						idx = choice;
						num = 0;
					}
					else {
						num++;
						
						num %= s[idx].length();
					}
				}
			}
			sb.append(result).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String[] s = br.readLine().split(" ");
		
			for(int i = 0; i < s.length; i++) {
				int num = 0;
				for(char c : s[i].toCharArray()) {
					num += c - 'a';
					
					num %= 27;
				}
				
				sb.append(num == 26 ? " " : (char)(num + 'a'));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

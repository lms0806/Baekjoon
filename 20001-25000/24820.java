import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] ch = new char[7];
		
		String str = br.readLine();
		for(int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			if(solve(s, ch)) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean solve(String s, char[] ch) {
		if(s.length() < 4 || !s.contains(ch[0] + "")) {
			return false;
		}
		
		for(char c : s.toCharArray()) {
			boolean flag = false;
			for(int i = 0; i < ch.length; i++) {
				if(c == ch[i]) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				return false;
			}
		}
		return true;
	}
}

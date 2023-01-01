import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String[] s = new String[3];
			
			for(int i = 0; i < 3; i++) {
				s[i] = br.readLine();
			}
			
			sb.append(solve(s)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String[] s) {
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s.length; j++) {
				if(i != j) {
					if(s[i].startsWith(s[j]) || s[i].endsWith(s[j])) {
						return "No";
					}
				}
			}
		}
		return "Yes";
	}
}

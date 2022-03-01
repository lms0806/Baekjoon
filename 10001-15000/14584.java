import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] strs = new String[n];
		
		for(int i = 0; i < n; i++) {
			strs[i] = br.readLine();
		}
		
		while(true) {
			String str = "";
			
			for(char c : s.toCharArray()) {
				c++;
				if(c > 'z') {
					c -= 26;
				}
				
				str += (char)c;
			}
			s = str;
			for(int i = 0; i < n; i++) {
				if(s.contains(strs[i])) {
					System.out.print(s);
					return;
				}
			}
		}
	}
}

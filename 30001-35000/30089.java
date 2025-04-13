import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			sb.append(s);
			int idx = 0;
			while(true) {
				boolean check = true;
				for(int i = 0; i + idx < s.length(); i++) {
					if(s.charAt(i + idx) != s.charAt(s.length() - 1 - i)) {
						idx++;
						check = false;
						break;
					}
				}
				
				if(check) {
					break;
				}
			}
			
			for(int i = idx - 1; i >= 0; i--) {
				sb.append(s.charAt(i));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

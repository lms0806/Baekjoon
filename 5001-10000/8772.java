import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			String s = br.readLine();
			int n = br.readLine().charAt(0) - s.charAt(0);
			
			for(char c : s.toCharArray()) {
				c += n;
				
				if(c < 'a') {
					c += 26;
				}
				else if(c > 'z') {
					c -= 26;
				}
				
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

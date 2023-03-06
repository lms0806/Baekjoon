import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			String[] s = br.readLine().split(" ");
			
			if(s[0].contains("machula")) {
				s[0] = String.valueOf(Integer.parseInt(s[4]) - Integer.parseInt(s[2]));
			}
			else if(s[2].contains("machula")) {
				s[2] = String.valueOf(Integer.parseInt(s[4]) - Integer.parseInt(s[0]));
			}
			else {
				s[4] = String.valueOf(Integer.parseInt(s[0]) + Integer.parseInt(s[2]));
			}
			
			sb.append(s[0]).append(" + " ).append(s[2]).append(" = ").append(s[4]).append("\n");
		}
		System.out.print(sb);
	}
}

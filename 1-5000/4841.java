import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine() + " ";
			
			int count = 1;
			char c = s.charAt(0);
			for(int i = 1; i < s.length(); i++) {
				if(c == s.charAt(i)) {
					count++;
				}
				else {
					sb.append(count).append(c);
					c = s.charAt(i);
					count = 1;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

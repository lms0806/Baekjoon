import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			br.readLine();
			
			String s = "abcdefghijklmnopqrstuvwxyz";
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int n = Integer.parseInt(st.nextToken());
				
				sb.append(s.charAt(n));
				s = s.charAt(n) + s.substring(0, n) + s.substring(n + 1);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

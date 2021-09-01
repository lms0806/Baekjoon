import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			String s = br.readLine();
			
			int num = 0;
			for(int j = 0; j < s.length() / 2; j++) {
				if(s.charAt(j) != s.charAt(s.length() - j - 1)) {
					num++;
				}
			}
			sb.append("Case #").append(i).append(": ").append(Math.abs(n - num)).append("\n");
		}
		System.out.print(sb);
	}
}

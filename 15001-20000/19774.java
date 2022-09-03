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
			int a = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
			int b = (s.charAt(2) - '0') * 10 + s.charAt(3) - '0';
			
			int num = (int) (Math.pow(a, 2) + Math.pow(b, 2)) % 7;
			
			sb.append(num == 1 ? "YES" : "NO").append("\n");
		}
		System.out.print(sb);
	}
}

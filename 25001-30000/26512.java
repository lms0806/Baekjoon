import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			if(x == 0 && y == 0) {
				break;
			}
			
			sb.append(print(x)).append("\n").append(print(y)).append("\n");
			sb.append(print(-x)).append("\n").append(print(-y)).append("\n");
			sb.append(print(x - y)).append("\n\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int n) {
		if(n < 0) {
			String s = Integer.toBinaryString(-n - 1);
			StringBuilder sb = new StringBuilder();
			for(char c : s.toCharArray()) {
				sb.append(c == '1' ? '0' : '1');
			}
			return n + " = " + "1".repeat(8 - s.length()) + sb.toString();
		}
		String s = Integer.toBinaryString(n);
		return n + " = " + "0".repeat(8 - s.length()) + s;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			sb.append(solve(Integer.toBinaryString(Integer.parseInt(s)))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s) {
		int zero = 0, one = 0;
		for(char c : s.toCharArray()) {
			if(c == '0') {
				zero++;
			}
			else {
				one++;
			}
		}
		
		return zero > one ? "left" : zero == one ? "straight" : "right";
	}
}

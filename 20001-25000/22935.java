import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = (Integer.parseInt(br.readLine()) - 1) % 28 + 1;

			if(n >= 15) {
				n = 30 - n;
			}
			
			String s = Integer.toBinaryString(n);
			
			if(s.length() < 4) {
				s = "0".repeat(4 - s.length()) + s;
			}
			
			for(char c : s.toCharArray()) {
				sb.append(c == '0' ? "V" : "딸기");
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

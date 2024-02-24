import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int answer = 0;
			String s = br.readLine().replaceAll(" ", "");
			
			if(s.equals("0000000000000000")) {
				break;
			}
			
			for(int i = 0; i < s.length(); i++) {
				int num = s.charAt(i) - '0';
				
				if(i % 2 == 0) {
					num *= 2;
					
					if(num > 9) {
						num -= 9;
					}
				}
				
				answer += num;
			}
			sb.append(answer % 10 == 0 ? "Yes" : "No").append("\n");
		}
		System.out.print(sb);
	}
}

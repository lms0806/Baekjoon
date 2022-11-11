import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("99999")) {
				break;
			}
			
			int num = s.charAt(0) - '0' + s.charAt(1) - '0';
			
			if(num != 0 && num % 2 == 0){
				str = "right";
			}
			else if(num % 2 == 1) {
				str = "left";
			}
			
			sb.append(str).append(" ").append(s.substring(2)).append("\n");
		}
		System.out.print(sb);
	}
}

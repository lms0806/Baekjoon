import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			int len = s.length();
			int count = 0;
			while(true) {
				if(s.equals(new StringBuilder(s).reverse().toString())) {
					break;
				}
				
				count++;
				s = String.valueOf(Integer.parseInt(s) + 1);
				
				s = "0".repeat(len - s.length()) + s;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}

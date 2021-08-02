import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = br.readLine();
			
			if(a.equals("0")) {
				break;
			}
			
			int i = 0;
			for(char ch : br.readLine().toCharArray()) {
				int n = a.charAt(i) + (ch - 'A') + 1;
				
				sb.append(n > 'Z' ? (char)(n - 26) : (char)n);
				
				i++;
				
				if(i >= a.length()) {
					i = 0;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

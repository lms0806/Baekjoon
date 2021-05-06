import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			boolean[] alpha = new boolean[26];
			
			if(str.equals("*")) {
				break;
			}
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					alpha[str.charAt(i) - 'a'] = true;
				}
			}
			
			for(int i = 0; i < alpha.length; i++) {
				if(!alpha[i]) {
					sb.append("N");
					break;
				}
				if(i == alpha.length-1) {
					sb.append("Y");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

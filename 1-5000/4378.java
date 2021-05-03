import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

		String s = "";
		
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			String answer = "";
			
			if(s.equals("")) {
				break;
			}
			
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == ' ') {
					answer += " ";
				}
				else {
					for(int j = 0; j < str.length(); j++) {
						if(ch == str.charAt(j)) {
							answer += str.charAt(j-1);
							break;
						}
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

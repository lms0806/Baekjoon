import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			boolean check = true;
			while(true) {
				String str = br.readLine();
				
				if(str.equals("#")) {
					break;
				}
				
				if(s.length() != str.length()) {
					check = false;
				}
				else {
					int count = 0;
					for(int i = 0; i < s.length(); i++) {
						if(s.charAt(i) != str.charAt(i)) {
							count++;
						}
					}
					
					if(count != 1) {
						check = false;
					}
				}
				
				s = str;
			}
			
			sb.append(check ? "Correct" : "Incorrect").append("\n");
		}
		System.out.print(sb);
	}
}

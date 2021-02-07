import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!str.equals("0")) {
			str = br.readLine();
			
			if(str.equals("0")) {
				break;
			}
			
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == str.charAt(str.length()-i-1)) {
					count++;
				}
			}
			if(count == str.length()) {
				sb.append("yes").append("\n");
			}
			else {
				sb.append("no").append("\n");
			}
		}
		System.out.print(sb);
	}
}

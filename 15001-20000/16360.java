import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = br.readLine();
			char ch = str.charAt(str.length()-1);
			if(ch == 'a' || ch == 'u' || ch == 'o') {
				str += "s";
			}
			else if(ch == 'i') {
				str += "os";
			}
			else if(ch == 'r' || ch == 'v' || ch == 'l') {
				str += "es";
			}
			else if(ch == 't' || ch == 'w') {
				str += "as";
			}
			else if(ch == 'y') {
				str = str.substring(0,str.length()-1) + "ios";
			}
			else if(ch == 'n') {
				str = str.substring(0,str.length()-1) + "anes";
			}
			else if(str.substring(str.length()-2).equals("ne")) {
				str = str.substring(0,str.length()-2) + "anes";
			}
			else {
				str += "us";
			}
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch >= 'A' && ch <= 'Z') {
				sb.append(ch - 13 < 'A' ? (char)(ch+13) : (char)(ch-13));
			}
			else if(ch >= 'a' && ch <= 'z') {
				sb.append(ch - 13 < 'a' ? (char)(ch+13) : (char)(ch-13));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.print(sb);
	}
}

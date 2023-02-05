import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = 0, clone = 0, underbar = 0;
		
		for(char c : br.readLine().toCharArray()) {
			len++;
			
			if(c == ':') {
				clone++;
			}
			else if(c == '_') {
				underbar++;
			}
		}
		
		System.out.print(len + clone + underbar * 5);
	}
}

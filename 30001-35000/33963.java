import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int answer = 0;
		int n = Integer.parseInt(s);
		while(true) {
			n <<= 1;
			
			if(s.length() != String.valueOf(n).length()) {
				break;
			}
			answer++;
		}
		System.out.print(answer);
	}
}

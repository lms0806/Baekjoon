import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		long answer = 0, n = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch >= '0' && ch <= '9') {
				n *= 10;
				n += ch - '0';
			}
			else {
				answer += n;
				n = 0;
			}
		}
		
		System.out.print(answer + n);
	}
}

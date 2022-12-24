import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int b = 0, c = 0;
		
		for(char ch : br.readLine().toCharArray()) {
			if(ch == 'B') {
				b++;
			}
			else {
				c++;
			}
		}
		
		System.out.print(b / 2 + c / 2);
	}
}

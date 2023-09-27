import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		int a = 0, b = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'N') {
				a++;
			}
			else if(c == 'S') {
				a--;
			}
			else if(c == 'E') {
				b++;
			}
			else {
				b--;
			}
		}
		System.out.print(Math.abs(a) + Math.abs(b));
	}
}

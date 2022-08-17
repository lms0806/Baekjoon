import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		long d = 0, k = 0, s = 0, h = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'D') {
				d++;
			}
			else if(c == 'K') {
				k += d;
			}
			else if(c == 'S') {
				s += k;
			}
			else if(c == 'H') {
				h += s;
			}
		}
		System.out.print(h);
	}
}

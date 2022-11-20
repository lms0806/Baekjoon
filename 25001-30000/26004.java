import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int h = 0, i = 0, a = 0, r = 0, c = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == 'H') {
				h++;
			}
			if(ch == 'I') {
				i++;
			}
			if(ch == 'A') {
				a++;
			}
			if(ch == 'R') {
				r++;
			}
			if(ch == 'C') {
				c++;
			}
		}
		System.out.print(Math.min(h, Math.min(i, Math.min(a, Math.min(r, c)))));
	}
}

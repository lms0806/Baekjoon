import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int a = 0, b = 0;
		for(char c : br.readLine().toCharArray()) {
			int num = c - '0';
			
			if(num % 2 == 0) {
				a++;
			}
			else {
				b++;
			}
		}
		System.out.print(a < b ? 1 : a > b ? 0 : -1);
	}
}

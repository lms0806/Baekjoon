import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
		
		int n = 0;
		for(char ch : br.readLine().toCharArray()) {
			n += num[ch - 'A'];
			if(n > 9) {
				n %= 10;
			}
		}
		System.out.print(n % 2 == 1 ? "I'm a winner!" : "You're the winner?");
	}
}

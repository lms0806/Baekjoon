import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		boolean flag = false;
		int n = 0;
		for(char c : br.readLine().toCharArray()) {
			if(!flag && c == 'I') {
				n++;
				flag = true;
			}
			if(flag && c == 'O') {
				n++;
				flag = false;
			}
			if(n == 3) {
				break;
			}
		}
		
		System.out.print(n == 3 ? "Yes" : "No");
	}
}

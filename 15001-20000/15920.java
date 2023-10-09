import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int which = 0, answer = 0;
		boolean check = false, plus = false, onep = false;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'P') {
				check = !check;
				
				if(which == 1) {
					onep = true;
				}
			}
			else {
				which++;
				
				if(!plus && which == 2) {
					answer += onep ? 6 : check ? 1 : 5;
				}
				
				if(which > 2) {
					onep = false;
					plus = false;
				}
			}
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = 1;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == 'A') {
				if(answer == 1) {
					answer = 2;
				}
				else if(answer == 2) {
					answer = 1;
				}
			}
			else if(ch == 'B') {
				if(answer == 2) {
					answer = 3;
				}
				else if(answer == 3) {
					answer = 2;
				}
			}
			else {
				if(answer == 1) {
					answer = 3;
				}
				else if(answer == 3) {
					answer = 1;
				}
			}
		}
		System.out.print(answer);
	}
}

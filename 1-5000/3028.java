import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int answer = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				if(answer == 1) {
					answer = 2;
				}
				else if(answer == 2) {
					answer = 1;
				}
			}
			else if(str.charAt(i) == 'B') {
				if(answer == 2) {
					answer = 3;
				}
				else if(answer == 3) {
					answer = 2;
				}
			}
			else if(str.charAt(i) == 'C') {
				if(answer == 1) {
					answer = 3;
				}
				else if(answer == 3) {
					answer = 1;
				}
			}
		}
		System.out.println(answer);
	}
}

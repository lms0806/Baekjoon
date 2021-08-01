import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch < 68) {
				answer += 3;
			}
			else if(ch < 71) {
				answer += 4;
			}
			else if(ch < 74) {
				answer += 5;
			}
			else if(ch < 77) {
				answer += 6;
			}
			else if(ch < 80) {
				answer += 7;
			}
			else if(ch < 84) {
				answer += 8;
			}
			else if(ch < 87) {
				answer += 9;
			}
			else if(ch < 91) {
				answer += 10;
			}
		}
		System.out.print(answer);
	}
}

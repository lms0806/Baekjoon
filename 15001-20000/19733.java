import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int count = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == 'A') {
				count++;
			}
		}
		
		int answer = 0;
		while(count > 0) {
			answer++;
			count -= answer + 1;
		}
		System.out.print(answer);
	}
}

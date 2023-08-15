import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = {2, 1, 1, 1, 2, 2, 1, 3, 3, 2, 3, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		int answer = 0;
		for(char c : br.readLine().toCharArray()) {
			answer += alpha[c - 'A'];
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 5;
		for(int i = 1; i < size; i++) {
			answer = (answer + 3 * i + 4) % 45678;
		}
		System.out.print(answer);
	}
}

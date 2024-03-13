import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(x < n) {
			int choice = x % 3;
			
			if(choice == 0) {
				x++;
			}
			else if(choice == 1) {
				x *= 2;
			}
			else {
				x *= 3;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}

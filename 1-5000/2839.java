import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		while(n > 0) {
			if(n % 5 == 0) {
				n-=5;
			}
			else if(n % 3 == 0) {
				n -= 3;
			}
			else if(n > 5) {
				n -= 5;
			}
			else {
				answer = -1;
				break;
			}
			answer++;
		}
		System.out.print(answer);
	}
}

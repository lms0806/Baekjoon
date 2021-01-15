import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long a = Long.parseLong(br.readLine());
		
		long answer = a%8;
		if(answer == 0) {
			answer = 2;
		}
		else if(answer == 6) {
			answer = 4;
		}
		else if(answer == 7) {
			answer = 3;
		}
		
		System.out.println(answer);
	}
}

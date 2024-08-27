import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		long n = Long.parseLong(br.readLine());
		
		long num = 11;
		int answer = 1;
		while(n >= num) {
			num = num * 10 + 1;
			answer++;
		}
		System.out.print(answer);
	}
}

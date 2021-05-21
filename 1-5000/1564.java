import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		long answer = 1;
		for(long i = 1; i <= num; i++) {
			answer *= i;
			while(answer%10 == 0) {
				answer/=10;
			}
			answer %= 1000000000000l;
		}
        answer %= 100000;
		System.out.print(String.format("%05d", answer));
	}
}

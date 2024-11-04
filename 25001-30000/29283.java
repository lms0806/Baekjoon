import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int size = n / 5;
		n %= 5;
		
		long num = 30, answer = 0;
		while(size --> 0 ) {
			answer += num * 5;
			num += 30;
		}
		System.out.print(answer + num * n);
	}
}

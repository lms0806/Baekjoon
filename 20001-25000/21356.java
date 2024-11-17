import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int num = Integer.parseInt("1".repeat(String.valueOf(n).length()));
		
		int answer = 0;
		while(n != 0 && num != 0) {
			answer += n / num;
			n %= num;
			num /= 10;
		}
		System.out.print(answer);
	}
}

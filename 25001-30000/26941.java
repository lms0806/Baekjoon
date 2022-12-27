import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int num = 1, sum = 0;
		while(sum <= n) {
			sum += num * num;
			
			num += 2;
			answer++;
		}
		System.out.print(answer - 1);
	}
}

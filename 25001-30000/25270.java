import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int n) {
		if(n < 99) {
			return 99;
		}
		
		int answer = 99;
		while(n > answer) {
			answer += 100;
		}
		
		if(answer - n > n - answer + 100) {
			return answer - 100;
		}
		else {
			return answer;
		}
	}
}

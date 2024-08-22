import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int max = 0, p = 0;
		for(int i = 2; i <= n; i++) {
			int sum = sum(n, i);
			
			if(sum > max) {
				max = sum;
				p = i;
			}
		}
		System.out.print(max + " " + p);
	}
	
	public static int sum(int n, int x) {
		int answer = 0;
		while(n != 0) {
			answer += n % x;
			n /= x;
		}
		return answer;
	}
}

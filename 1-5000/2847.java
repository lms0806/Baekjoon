import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		for(int i = n - 1; i > 0; i--) {
			if(num[i] <= num[i - 1]) {
				answer += num[i - 1] - num[i] + 1;
				num[i - 1] = num[i] - 1;
			}
		}
		System.out.print(answer);
	}
}

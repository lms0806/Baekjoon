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
		
		int max = 0, answer = 0;
		for(int i = n-1; i >= 0; i--) {
			if(max < num[i]) {
				max = num[i];
				answer++;
			}
		}
		System.out.print(answer);
	}
}

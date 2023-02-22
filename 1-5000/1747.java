import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean[] prime = new boolean[1000001];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i * i < 1000001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 1000001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = n; i < 1000001; i++) {
			if(!prime[i]) {
				String s = String.valueOf(i);
				
				if(s.equals(new StringBuilder(s).reverse().toString())) {
					answer = i;
					break;
				}
			}
		}
		System.out.print(answer == 0 ? 1003001 : answer);
	}
}

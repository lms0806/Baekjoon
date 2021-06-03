import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[104730];
		Arrays.fill(prime, true);
		
		prime[0] = prime[1] = false;
		
		for(int i = 2; i * i <= 104729; i++) {
			for(int j = i * i; j <= 104729; j += i) {
				prime[j] = false;
			}
		}
		
		int number = 0, answer = 0;
		for(int i = 2; i <= 104729; i++) {
			if(prime[i]) {
				number++;
				if(num == number) {
					answer = i;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}

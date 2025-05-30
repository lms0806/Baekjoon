import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
        
        for(int i = 2; i * i < 1000001; i++){
            if(!prime[i]){
            	for(int j = i * i; j < 1000001; j+=i) {
            		prime[j] = true;                
            	}
            }
        }
        
        System.out.print(solve(n, prime));
	}
	
	public static long solve(long n, boolean[] prime) {
		if(n % 2 == 0) {
			return n >> 1;
		}
		
		for(int i = 3; i < 1000001; i++) {
        	if(!prime[i] && n % i == 0) {
        		return ((n - i) >> 1) + 1;
        	}
        }
		return 1;
	}
}

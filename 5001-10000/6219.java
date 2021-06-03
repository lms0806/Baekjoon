import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String c = st.nextToken();
		
		prime = new boolean[b+1];
		Arrays.fill(prime, true);
		
		prime[0] = prime[1] = false;
		
		for(int i = 2; i * i <= b; i++) {
			for(int j = i * i; j <= b; j+=i) {
				prime[j] = false;
			}
		}
		
		int answer = 0;
		for(int i = a; i <= b; i++) {
			if(prime[i] && Integer.toString(i).contains(c)) {
                answer++;
			}
		}
		System.out.print(answer);
	}
}

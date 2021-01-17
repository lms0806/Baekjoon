import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n, k;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			if(n == 0 && k == 0) {
				break;
			}
			
			if(n - k < k) {
				k = n - k;
			}
			
			long answer = 1;
			for(int i = 1; i <= k; i++) {
				answer *= n-i+1;
				answer /= i;
			}
			
			System.out.println(answer);	
		}
	}
}

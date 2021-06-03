import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[b+1];
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i * i <= b; i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j <= b; j += i) {
				prime[j] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = a; i <= b; i++) {
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
	}
}

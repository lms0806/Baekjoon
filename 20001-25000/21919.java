import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		boolean[] isprime = new boolean[num[n - 1] + 1], check = new boolean[num[n - 1] + 1];
		for(int i = 2; i < num[n - 1]; i++) {
			if(!isprime[i]) {
				for(int j  = i + i; j <= num[n - 1]; j+=i) {
					isprime[j] = true;
				}
			}
		}
		
		long answer = 1;
		for(int i = 0; i < n; i++) {
			if(!isprime[num[i]] && !check[num[i]]) {
				answer *= num[i];
				check[num[i]] = true;
			}
		}
		System.out.print(answer == 1 ? -1 : answer); 
	}
}

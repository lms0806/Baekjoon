import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		int[] num = new int[21];
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().length();
			
			if(i <= m) {
				num[arr[i]]++;
			}
		}
		
		long answer = --num[arr[0]];
		for(int i = 1; i < n; i++) {		
			if(i + m < n) {
				num[arr[i + m]]++;
			}
			
			answer += --num[arr[i]];
		}
		System.out.print(answer);		
	}
}

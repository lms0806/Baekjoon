import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int answer = 0, sum = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			sum = sum + Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
			
			if(sum > k && answer < sum - k) {
				answer = sum - k;
			}
		}
		System.out.print(answer);
	}
}

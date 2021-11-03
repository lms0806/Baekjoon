import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[t];
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int k = Integer.parseInt(st.nextToken());
			
			for(int j = k - m; j < k + m; j++) {
				if(j == t) {
					break;
				}
				arr[j] = 1;
			}
		}
		
		int answer = 0;
		for(int a : arr) {
			if(a == 0) {
				answer++;
			}
		}
		System.out.print(answer);
		
	}
}

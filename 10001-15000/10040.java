import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], vote = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(m --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				if(arr[i] <= num) {
					vote[i]++;
					break;
				}
			}
		}
		
		int answer = 0, max = 0;
		for(int i = 0; i < n; i++) {
			if(vote[i] > max) {
				max = vote[i];
				answer = i + 1;
			}
		}
		System.out.print(answer);
	}
}

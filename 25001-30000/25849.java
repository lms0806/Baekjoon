import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = {1, 5, 10, 20, 50, 100};
		
		int max = 0, answer = 0, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(max < n * num[i]) {
				max = n * num[i];
				answer = num[i];
				count = n;
			}
			else if(max == n * num[i]) {
				if(count > n) {
					count = n;
					answer = num[i];
				}
			}
		}
		System.out.print(answer);
	}
}

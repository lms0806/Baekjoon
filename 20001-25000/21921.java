import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for(int j = 0; j < x; j++) {
			sum += num[j];
		}
		
		int max = sum, count = 1;
		for(int i = x; i < n; i++) {
			sum = sum + num[i] - num[i - x];
			
			if(sum > max) {
				max = sum;
				count = 1;
			}
			else if(sum == max) {
				count++;
			}
		}
		
		System.out.print(max == 0 ? "SAD" : max + "\n" + count);
	}
}

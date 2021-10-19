import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[31];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			for(int j = a; j < b; j++) {
				num[j]++;
			}
		}
		
		System.out.print(solve(num, Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int[] num, int k) {
		for(int i = 0; i < 31; i++) {
			if(num[i] > k) {
				return 0;
			}
		}
		return 1;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			sum += Long.parseLong(st.nextToken());
		}
		
		System.out.print(solve(sum));
	}
	
	public static long solve(long sum) {
		long idx = 1;
		while(true) {
			long num = (long) Math.pow(2, idx)
					;
			if(sum == num) {
				return num;
			}
			else if(sum < num) {
				return (long) Math.pow(2, idx - 1);
			}
			
			idx++;
		}
	}
}

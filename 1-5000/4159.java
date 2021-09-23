import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int[] num = new int[n];
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(num);
			
			sb.append(solve(num)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[] num) {
		if(1422 - num[num.length - 1] > 100) {
			return "IMPOSSIBLE";
		}
		
		for(int i = 1; i < num.length; i++) {
			if(num[i] - num[i - 1] > 200) {
				return "IMPOSSIBLE";
			}
		}
		return "POSSIBLE";
	}
}

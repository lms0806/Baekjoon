import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(solve(Long.parseLong(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(long n) {
		if(n % 8 != 0) {
			return "No";
		}
		
		long[] arr = {8, 88, 888, 8888, 88888, 888888, 8888888, 88888888, 888888888, 8888888888L, 88888888888L, 888888888888L, 8888888888888L, 88888888888888L, 888888888888888L, 8888888888888888L, 88888888888888888L, 888888888888888888L};
		
		for(int i = 0; i < 8; i++) {
			for(int j = arr.length - 1; j >= 0; j--) {
				if(n >= arr[j]) {
					n -= arr[j];
					break;
				}
			}
			
			if(n < 0) {
				return "No";
			}
			else if(n == 0) {
				return "Yes";
			}
		}
		return n == 0 ? "Yes" : "No";
	}
}

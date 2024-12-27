import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
	}
	
	public static long solve(long x, long y) {
		long num = y * 100 / x;
		
		if(num >= 99) {
			return -1;
		}

		long s = 0, e = x;
		long answer = Integer.MAX_VALUE;
		while(s <= e) {
			long mid = (s + e) >> 1;
		
			if((y + mid) * 100 / (x + mid) > num) {
				e = mid - 1;
				answer = Math.min(answer, mid);
			}
			else {
				s = mid + 1;
			}
		}
		return answer;
	}
}

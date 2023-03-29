import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static long p, q;
	static HashMap<Long, Long> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		p = Long.parseLong(st.nextToken());
		q = Long.parseLong(st.nextToken());
		
		System.out.print(solve(n));
	}
	
	public static long solve(long num) {
		if(num == 0) {
			return 1;
		}
		if(map.containsKey(num)) {
			return map.get(num);
		}
		
		map.put(num, solve(num / p) + solve(num / q));
		return map.get(num);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long b = Long.parseLong(st.nextToken());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Long> map = new HashMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			map.put(st.nextToken(), Long.parseLong(st.nextToken()));
		}
		
		long sum = 0;
		while(m --> 0) {
			sum += map.get(br.readLine());
		}
		System.out.print(b >= sum ? "acceptable" : "unacceptable");
	}
}

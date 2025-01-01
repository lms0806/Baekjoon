import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		long[] arr = new long[n];
		
		long answer = 0;
		HashMap<Long, Long> map = new HashMap<>();
		map.put(0L, 1L);
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
			if(i > 0) {
				arr[i] += arr[i - 1];
			}
			
			answer += map.containsKey(arr[i] - k) ? map.get(arr[i] - k) : 0;
			map.put(arr[i], map.getOrDefault(arr[i], 0L) + 1);
		}
		
		System.out.print(answer);
	}
}

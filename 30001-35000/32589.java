import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Long> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			map.put(num, map.getOrDefault(num, 0L) + 1);
		}
		
		long answer = 0;
		for(int key : map.keySet()) {
			answer += (n - map.get(key)) * map.get(key); 
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[100001];
		
		for(int i = 2; i * i < 100001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 100001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			TreeMap<Integer, Integer> map = new TreeMap<>();
			while(n != 1) {
				for(int i = 2; i <= n; i++) {
					if(!prime[i] && n % i == 0) {
						map.put(i, map.getOrDefault(i, 0) + 1);
						n /= i;
						break;
					}
				}
			}
			
			for(Integer key : map.keySet()) {
				sb.append(key).append(" ").append(map.get(key)).append("\n");
			}
		}
		System.out.print(sb);
	}
}

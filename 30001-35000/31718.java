import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			max = Math.max(max, arr[i]);
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			while(arr[i] <= max) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
				
				arr[i] <<= 1;
			}
		}
		
		int answer = 0;
		for(Integer key : map.keySet()) {
			answer = Math.max(answer, map.get(key));
		}
		System.out.print(answer);
	}
}

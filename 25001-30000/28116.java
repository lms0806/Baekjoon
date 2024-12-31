import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1], answer = new int[n + 1];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			map.put(arr[i], i);
		}

		for(int i = 1; i <= n; i++) {
			if(arr[i] != i) {
				int idx = map.get(i);
				
				answer[arr[i]] += idx - i;
				answer[arr[idx]] += idx - i;
				
				int temp = map.get(i);
				map.put(i, map.get(arr[i]));
				map.put(arr[i], temp);
				
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append(answer[i]).append(" ");
		}
		System.out.print(sb);
	}
}

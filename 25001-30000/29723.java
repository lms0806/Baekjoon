import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		int min = 0, max = 0;
		for(int i = 0; i < k; i++) {
			String s = br.readLine();
			
			min += map.get(s);
			max += map.get(s);
			
			map.remove(s);
		}
		
		int idx = 0;
		int[] arr = new int[map.size()];
		for(String key : map.keySet()) {
			arr[idx++] = map.get(key);
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < m - k; i++) {
			min += arr[i];
			max += arr[arr.length - 1 - i];
		}
		
		System.out.print(min + " " + max);
	}
} 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		int max = -1;
		for(Integer key : map.keySet()) {
			if(map.get(key) == 1) {
				max = key;
			}
		}
		
		if(max == -1) {
			System.out.print("none");
		}
		else {
			int answer = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i] == max) {
					answer = i + 1;
					break;
				}
			}
			System.out.print(answer);
		}
	}
}

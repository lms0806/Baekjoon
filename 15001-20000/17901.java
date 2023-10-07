import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		boolean flag = false;
		int answer = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(num)) {
				flag = true;
				
				answer = Math.min(answer, i - map.get(num));
			}
			map.put(num, i);
		}
		
		System.out.print(flag ? answer : map.size());
	}
}

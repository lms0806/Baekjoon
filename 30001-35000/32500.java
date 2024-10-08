import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) * 10;
		
		int count = n / 5;
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 5; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : map.keySet()) {
			if(map.get(key) > count) {
				sb.append(key).append(" ");
			}
		}
		System.out.print(sb.length() == 0 ? -1 : sb);
	}
}

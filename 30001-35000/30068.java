import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(b)) {
				sb.append(b).append(" ").append(a - map.get(b)).append("\n");
			}
			else {
				map.put(b, a);
			}
		}
		System.out.print(sb);
	}
}

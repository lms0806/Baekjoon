import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			TreeMap<String, Integer> map = new TreeMap<>();
			
			while(n --> 0) {
				String[] str = br.readLine().toLowerCase().split(" ");
				String s = str[str.length - 1];
				
				map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			}
			
			sb.append("List ").append(count).append(":").append("\n");
			for(String key : map.keySet()) {
				sb.append(key).append(" | ").append(map.get(key)).append("\n");
			}
			count++;
		}
		System.out.print(sb);
	}
}

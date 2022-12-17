import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		int sum = 0;
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			map.put(s, map.getOrDefault(s, 0) + 1);
			sum++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s : map.keySet()) {
			sb.append(s).append(": ").append(map.get(s)).append("\n");
		}
		sb.append("Grand Total: ").append(sum);
		
		System.out.print(sb);
	}
}

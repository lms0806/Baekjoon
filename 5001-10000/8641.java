import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			map.put(a, map.containsKey(a) ? map.get(a) + b : b);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(map.size()).append("\n");
		for(Integer a : map.keySet()) {
			sb.append(a).append(" ").append(map.get(a)).append("\n");
		}
		System.out.print(sb);
	}
}

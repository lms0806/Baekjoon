import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			String b = st.nextToken();
			int num = Integer.parseInt(b.substring(1));
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + (b.charAt(0) == '+' ? num : -num));
			}
			else {
				map.put(c, b.charAt(0) == '+' ? num : -num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character ch : map.keySet()) {
			sb.append(ch).append(" ").append(map.get(ch)).append("\n");
		}
		System.out.print(sb);
	}
}

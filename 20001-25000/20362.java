import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		String str = st.nextToken();
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			map.put(st.nextToken(), st.nextToken());
		}
		
		String answer = map.get(str);
		int result = 0;
		for(String s : map.keySet()) {
			if(s.equals(str)) {
				break;
			}
			if(map.get(s).equals(answer)) {
				result++;
			}
		}
		System.out.print(result);
	}
}

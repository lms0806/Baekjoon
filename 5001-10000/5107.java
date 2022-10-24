import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			HashMap<String, String> map = new HashMap<>();
			while(t --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				map.put(st.nextToken(), st.nextToken());
			}
			
			int count = 0;
			HashSet<String> set = new HashSet<>();
			for(String key : map.keySet()) {
				if(!set.contains(key)) {
					String s = key;
					while(true) {
						if(set.contains(s)) {
							break;
						}
						
						set.add(s);
						s = map.get(s);
					}
					count++;
				}
			}
			sb.append(idx).append(" ").append(count).append("\n");
			idx++;
		}
		System.out.print(sb);
	}
}

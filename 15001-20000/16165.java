import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		TreeMap<String, String> map = new TreeMap<>();
		
		while(n --> 0) {
			String team = br.readLine();
			
			int size = Integer.parseInt(br.readLine());
			
			while(size --> 0) {
				map.put(br.readLine(), team);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			String question = br.readLine();
			
			int choice = Integer.parseInt(br.readLine());
			
			if(choice == 1) {
				for(String key : map.keySet()) {
					if(key.equals(question)) {
						sb.append(map.get(key)).append("\n");
						break;
					}
				}
			}
			else {
				for(String key : map.keySet()) {
					if(map.get(key).equals(question)) {
						sb.append(key).append("\n");
					}
				}
			}
		}
		System.out.print(sb);
	}
}

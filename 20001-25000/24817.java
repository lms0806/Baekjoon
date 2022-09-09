import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			map.put(br.readLine(), 0);
		}
		
		ArrayList<String> arr = new ArrayList<>();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			map.put(s, map.get(s) + num);
			
			if(map.get(s) >= score && !arr.contains(s)) {
				arr.add(s);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(arr.size() == 0) {
			sb.append("No winner!");
		}
		else {
			for(String a : arr) {
				sb.append(a).append(" wins!").append("\n");
			}
		}
		System.out.print(sb);
	}
}

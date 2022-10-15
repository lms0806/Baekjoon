import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			if(w == 0 && n == 0) {
				break;
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			ArrayList<String> arr = new ArrayList<>();
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int point = badpoint(st.nextToken());
				
				if(!arr.contains(s)) {
					arr.add(s);
				}
				
				map.put(s, map.containsKey(s) ? map.get(s) + point : point);
			}
			
			sb.append("Week ").append(w).append(" ");
			boolean flag = false;
			for(String key : arr) {
				if(map.get(key) >= 100) {
					flag = true;
					sb.append(key).append(",");
				}
			}
			
			if(!flag) {
				sb.append("No phones confiscated");
			}
			else {
				sb.setLength(sb.length() - 1);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int badpoint(String s) {
		switch(s) {
			case "TT":
				return 75;
			case "TX":
				return 50;
			case "PR":
				return 80;
			case "RT":
				return 30;
			case "AP":
				return 25;
			case "PX":
				return 60;
			default:
					return 0;
		}
	}
}

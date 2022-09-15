import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			HashMap<String, ArrayList<Integer>> map = new HashMap<>();
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				
				ArrayList<Integer> arr = new ArrayList<>();
				for(int i = 0; i < 3; i++) {
					arr.add(Integer.parseInt(st.nextToken()));
				}
				
				map.put(s, arr);
			}
			
			int inputnum = 100 / m;
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				String size = st.nextToken();
				String kind = st.nextToken();
				
				int sizenum = 0;
				if(size.equals("medium")) {
					sizenum = 1;
				}
				else if(size.equals("large")) {
					sizenum = 2;
				}
				
				int num = map.get(kind).get(sizenum) + inputnum;
				
				if(num % 5 == 1) {
					num--;
				}
				else if(num % 5 == 4) {
					num++;
				}
				
				sb.append(s).append(" ").append(num).append("\n");
			}
		}
		System.out.print(sb);
	}
}

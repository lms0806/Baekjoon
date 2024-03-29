import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
		while(n --> 0) {
			String s = br.readLine();
			
			int count = 0;
			for(int i = s.length() - 2; i > 0; i--) {
				if(s.charAt(i) != '.') {
					if(!map.containsKey(count)) {
						map.put(count, new ArrayList<>());
					}
					
					map.get(count).add(s.charAt(i) - '1');
					break;
				}
				
				count++;
			}
		}
		
		int[] result = new int[9];
		
		int rank = 1;
		for(Integer key : map.keySet()) {
			for(int i = 0; i < map.get(key).size(); i++) {
				result[map.get(key).get(i)] = rank;
			}
			rank++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int r : result) {
			sb.append(r).append("\n");
		}
		System.out.print(sb);
	}
}

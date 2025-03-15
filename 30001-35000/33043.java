import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int answer = Integer.MAX_VALUE;
		HashMap<String, Queue<Integer>> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			String s = st.nextToken();
			
			if(!map.containsKey(s)) {
				map.put(s, new LinkedList<>());
			}
			
			map.get(s).add(i);
			
			if(map.get(s).size() == 5) {
				int num = map.get(s).poll();
				
				answer = Math.min(answer, i - num + 1);
			}
		}
		System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
	}
}

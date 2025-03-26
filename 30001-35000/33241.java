import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int t = (n * (n - 1)) >> 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken(), b = st.nextToken();
			int scoreA = Integer.parseInt(st.nextToken()), socreB = Integer.parseInt(st.nextToken());
            
			if(scoreA > socreB) {
				map.put(a, map.getOrDefault(a, 0) + 3);
				map.putIfAbsent(b, 0);
			}
			else if(scoreA < socreB) {
				map.putIfAbsent(a, 0);
				map.put(b, map.getOrDefault(b, 0) + 3);
			}
			else {
				map.put(a, map.getOrDefault(a, 0) + 1);
				map.put(b, map.getOrDefault(b, 0) + 1);
			}
		}
		
		ArrayList<Node> arr = new ArrayList<>();
		for(String key : map.keySet()) {
			arr.add(new Node(key, map.get(key)));
		}

		Collections.sort(arr);
		
		int size = Math.min(arr.size(), 5);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {       
            sb.append(arr.get(i).team).append(" ").append(arr.get(i).score).append("\n");
        }
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	String team;
	int score;
	
	public Node(String team, int score) {
		this.team = team;
		this.score = score;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.score == o.score ? this.team.compareTo(o.team) : o.score - this.score;
	}
}

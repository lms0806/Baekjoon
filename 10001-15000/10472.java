import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[][] num = {{0, 1, 3}, {0, 1, 2, 4}, {1, 2, 5},{0, 3, 4, 6},{1, 3, 4, 5, 7},{2, 4, 5, 8},{3, 6, 7},{4, 6, 7, 8},{5, 7, 8}};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = "";
			for(int i = 0; i < 3; i++) {
				for(char c : br.readLine().toCharArray()) {
					str += c == '*' ? "1" : "0";
				}
			}
			
			sb.append(str.equals("000000000") ? 0 : bfs(str)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int bfs(String str) {
		Queue<String> queue = new LinkedList<>();
		HashSet<String> set = new HashSet<>();
		queue.add("000000000");
		set.add("000000000");
		
		int time = 1;
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			while(size --> 0) {
				String now = queue.poll();
				
				for(int i = 0; i < 9; i++) {
					char[] nexts = now.toCharArray();
					for(int j = 0; j < num[i].length; j++) {
						if(nexts[num[i][j]] == '1') {
							nexts[num[i][j]] = '0';
						}
						else {
							nexts[num[i][j]] = '1';
						}
					}
					String next = new String(nexts);
					
					if(set.contains(next)) {
						continue;
					}
					
					if(next.equals(str)) {
						return time;
					}
					queue.add(next);
					set.add(next);
				}
			}
			time++;
		}
		return -1;
	}
}

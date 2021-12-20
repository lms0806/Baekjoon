import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String start = "";
		for(int i = 0; i < 3; i++) {
			start += br.readLine().replaceAll(" ", "");
		}
		
		System.out.print(bfs(start));
	}
	
	public static int bfs(String start) {
		HashMap<String, Integer> map = new HashMap<>();
		Queue<String> queue = new LinkedList<>();
		queue.add(start);
		map.put(start, 0);
		
		while(!queue.isEmpty()) {
			String now = queue.poll();
			int move = map.get(now);
			int empty = now.indexOf('0');
			int x = empty % 3;
			int y = empty / 3;
			
			if(now.equals("123456780")) {
				return move;
			}
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
					char c = now.charAt(ny * 3 + nx);
					
					String next = now.replace(c, 'c');
					next = next.replace('0', c);
					next = next.replace('c', '0');
					
					if(!map.containsKey(next)) {
						queue.add(next);
						map.put(next, move + 1);
					}
				}
			}
		}
		return -1;
	}
}

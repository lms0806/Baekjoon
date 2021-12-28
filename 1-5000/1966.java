import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> queue = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				queue.add(new int[] {i, Integer.parseInt(st.nextToken())});
			}
			
			int count = 0;
			while(!queue.isEmpty()) {
				int[] front = queue.poll();
				
				boolean check = true;
				for(int i = 0; i < queue.size(); i++) {
					if(front[1] < queue.get(i)[1]) {
						queue.add(front);
						
						for(int j = 0; j < i; j++) {
							queue.add(queue.poll());
						}
						
						check = false;
						break;
					}
				}
				
				if(!check) {
					continue;
				}
				
				count++;
				if(front[0] == m) {
					break;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}

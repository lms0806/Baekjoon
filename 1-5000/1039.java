import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		
		if(n.length() == 1 || (n.length() == 2 && Integer.parseInt(n) % 10 == 0)) {
			System.out.print(-1);
		}
		else {
			System.out.print(bfs(n, k));
		}
	}
	
	public static int bfs(String n, int k) {
		Queue<String> queue = new LinkedList<>();
		queue.add(n);
		
		int answer = 0, count = 0;
		while(!queue.isEmpty() && count < k) {
			int size = queue.size();
			HashSet<String> set = new HashSet<>();
			
			while(size --> 0) {
				String now = queue.poll();
				
				char[] c = now.toCharArray();
				for(int i = 0; i < c.length - 1; i++) {
					for(int j = i + 1; j < c.length; j++) {
						if(i == 0 && c[j] == '0') {
							continue;
						}
						
						char temp = c[i];
						c[i] = c[j];
						c[j] = temp;
						
						String str = String.valueOf(c);
						if(!set.contains(str)) {
							set.add(str);
							queue.add(str);
							if(count == k - 1) {
								answer = Math.max(answer, Integer.parseInt(str));
							}
						}
						
						temp = c[i];
						c[i] = c[j];
						c[j] = temp;
					}
				}
			}
			count++;
		}
		return count != k ? -1 : answer;
	}
}

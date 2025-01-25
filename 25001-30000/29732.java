import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int count = 0;
		char[] ch = br.readLine().toCharArray();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == 'R') {
				queue.add(i);
				count++;
			}
		}
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i = now + 1; i <= now + k; i++) {
				if(i > ch.length - 1) {
					break;
				}
				
				if(ch[i] == '.') {
					ch[i] = 'R';
					count++;
				}
			}
			
			for(int i = now - 1; i >= now - k; i--) {
				if(i < 0) {
					break;
				}
				
				if(ch[i] == '.') {
					ch[i] = 'R';
					count++;
				}
			}
		}
		
		System.out.print(count <= m ? "Yes" : "No");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Queue<Integer> queue = new LinkedList<>();
		
		int size = Integer.parseInt(br.readLine());
		int num = 0;
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			char ch = s.charAt(0);
			if(ch == 'p') {
				if(s.charAt(1) == 'u') {
					num = Integer.parseInt(st.nextToken());
					queue.add(num);
				}
				else {
					sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
				}
			}
			else {
				if(ch == 'f') {
					sb.append(queue.isEmpty() ? -1 : queue.peek());
				}
				else if(ch == 'b') {
					sb.append(queue.isEmpty() ? -1 : num);
				}
				else if(ch == 'e') {
					sb.append(queue.isEmpty() ? 1 : 0);
				}
				else {
					sb.append(queue.size());
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			br.readLine();
			
			Deque<Character> deque = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				char ch = st.nextToken().charAt(0);
				
				if(deque.isEmpty()) {
					deque.add(ch);
				}
				else {
					if(deque.getFirst() >= ch) {
						deque.addFirst(ch);
					}
					else {
						deque.addLast(ch);
					}
				}
			}
			while(deque.size() != 0) {
				sb.append(deque.poll());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

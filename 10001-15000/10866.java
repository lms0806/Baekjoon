import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			String str = br.readLine();
			
			char ch = str.charAt(0);
			if(ch == 'f') {
				sb.append(deque.isEmpty() ? -1 : deque.getFirst()).append("\n");
			}
			else if(ch == 'b') {
				sb.append(deque.isEmpty() ? -1 : deque.getLast()).append("\n");
			}
			else if(ch == 'e') {
				sb.append(deque.isEmpty() ? 1 : 0).append("\n");
			}
			else if(ch == 's') {
				sb.append(deque.size()).append("\n");
			}
			else if(ch == 'p') {
				if(str.charAt(1) == 'u') {
					if(str.charAt(5) == 'f') {
						deque.addFirst(Integer.parseInt(str.substring(11)));
					}
					else {
						deque.addLast(Integer.parseInt(str.substring(10)));
					}
				}
				else {
					if(str.charAt(4) == 'f') {
						sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
					}
					else {
						sb.append(deque.isEmpty() ? -1 : deque.pollLast());
					}
					sb.append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}

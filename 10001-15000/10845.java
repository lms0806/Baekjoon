import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Queue<Integer> queue = new LinkedList<>();
		
		int size = Integer.parseInt(br.readLine());
		int ch, num = 0;
		String str;
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			str = br.readLine();
			ch = str.charAt(0);
			if(ch == 'p') {
				if(str.charAt(1) == 'u') {
					num = Integer.parseInt(str.substring(5));
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

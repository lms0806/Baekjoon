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
		int charat, num = 0;
		String str;
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			str = br.readLine();
			charat = str.charAt(0);
			if(charat == 'f') {
				sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
			}
			else if(charat == 'b') {
				sb.append(queue.isEmpty() ? -1 : num).append("\n");
			}
			else if(charat == 'e') {
				sb.append(queue.isEmpty() ? 1 : 0).append("\n");
			}
			else if(charat == 's') {
				sb.append(queue.size()).append("\n");
			}
			else if(charat == 'p') {
				if(str.charAt(1) == 'u') {
					num = Integer.parseInt(str.substring(5));
					queue.add(num);
				}
				else {
					sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}

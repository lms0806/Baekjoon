import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(),"[],");
			
			Deque<Integer> arr = new ArrayDeque<>();
			while(n --> 0) {
				arr.add(Integer.parseInt(st.nextToken()));	
			}
			
			boolean b = true;
			boolean ok = true;
			for(char ch : str.toCharArray()) {
				if(ch == 'R') { 
					b = !b;
				}
				else {
					if((b && arr.pollFirst() == null) || (!b && arr.pollLast() == null)) {
						sb.append("error").append("\n");
						ok = false;
						break;
					}
				}
			}
			
			if(ok) {
				sb.append("[");
				if(arr.size() > 0) {
					if(b) {
						sb.append(arr.pollFirst());
						
						while(!arr.isEmpty()) {
							sb.append(",").append(arr.pollFirst());
						}
					}
					else {
						sb.append(arr.pollLast());
						
						while(!arr.isEmpty()) {
							sb.append(",").append(arr.pollLast());
						}
					}
				}
				sb.append("]").append("\n");
			}
		}
		System.out.print(sb);
	}
}

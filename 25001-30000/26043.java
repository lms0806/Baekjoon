import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		Queue<Node> queue = new LinkedList<>();
		
		ArrayList<Integer>[] arr = new ArrayList[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				queue.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			else {
				arr[Integer.parseInt(st.nextToken()) == queue.peek().like ? 0 : 1].add(queue.poll().num);
			}
		}
		
		while(!queue.isEmpty()) {
			arr[2].add(queue.poll().num);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {			
			if(arr[i].size() == 0) {
				sb.append("None");
			}
			else {
				Collections.sort(arr[i]);
				for(int a : arr[i]) {
					sb.append(a).append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}

class Node{
	int num, like;
	
	public Node(int num, int like) {
		this.num = num;
		this.like = like;
	}
}

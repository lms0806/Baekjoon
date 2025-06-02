import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Node> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr.add(new Node(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(arr, Comparator.comparingInt(w -> w.d));
		
		PriorityQueue<String>[] pq = new PriorityQueue[5];
		for(int i = 0; i < 4; i++) {
			pq[i] = new PriorityQueue<>();
		}
		
		for(int i = 0; i < n; i++) {
			pq[i % 4].add(arr.get(i).s);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			sb.append(i + 1).append(" ");
			while(!pq[i].isEmpty()) {
				sb.append(pq[i].poll()).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node {
	String s;
	int d;
	
	public Node(String s, int d) {
		this.s = s;
		this.d = d;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			PriorityQueue<Node> pq = new PriorityQueue<>();
			while(true) {
				s = br.readLine();
				
				if(s.equals("END")) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(s);
				pq.add(new Node(st.nextToken(), Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()))));
			}
			
			while(!pq.isEmpty()) {
				sb.append(pq.poll().name).append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	int weight;
	
	public Node(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return o.weight - this.weight;
	}
}

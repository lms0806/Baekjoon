import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		ArrayList<Node> arr = new ArrayList<>();
		
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			boolean flag = false;
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i).s.equals(s)) {
					arr.add(new Node(s, num + arr.get(i).num));
					arr.remove(i);
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				arr.add(new Node(s, num));
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : arr) {
			sb.append(node.s).append(" ").append(node.num).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String s;
	int num;
	
	public Node(String s, int num) {
		this.s = s;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		if(this.s.length() == o.s.length()) {
			return this.s.compareTo(o.s);
		}
		return this.s.length() - o.s.length();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		ArrayList<Node> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String choice = st.nextToken();
			
			if("sort".equals(choice)) {
				Collections.sort(arr);
			}
			else if("order".equals(choice)) {				
				arr.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			else {
				int num = Integer.parseInt(st.nextToken());
				for(int i = 0; i < arr.size(); i++) {
					if(arr.get(i).index == num) {
						arr.remove(i);
						break;
					}
				}
			}
			
			if(arr.size() == 0) {
				sb.append("sleep");
			}
			else {
				for(Node a : arr) {
					sb.append(a.index).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	int index, time;
	
	public Node(int index, int time) {
		this.index = index;
		this.time = time;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.time == o.time) {
			return this.index - o.index;
		}
		return this.time - o.time;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				map.put(br.readLine(), i);
			}
			
			Node[] arr = new Node[m];
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				String a = st.nextToken(), b = st.nextToken();
				
				if(!map.containsKey(b)) {
					map.put(b, n++);
				}
				
				arr[i] = new Node(map.get(b), i, a);
			}
			
			Arrays.sort(arr);
			
			for(Node node : arr) {
				sb.append(node.name).append("\n");
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int num, input;
	String name;
	
	public Node(int num, int input, String name) {
		this.num = num;
		this.input = input;
		this.name = name;
	}

	@Override
	public int compareTo(Node o) {
		return this.num == o.num ? this.input - o.input : this.num - o.num;
	}
}

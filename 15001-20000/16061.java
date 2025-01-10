import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int sum = 0, idx = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i].num;
			
			if(sum >= d) {
				idx = i + 1;
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(idx != 0) {
			sb.append(idx).append("\n");
			for(int i = 0; i < idx; i++) {
				sb.append(String.format("%s, YOU ARE FIRED!", arr[i].name)).append("\n");
			}
		}
		else {
			sb.append("impossible");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	String name;
	int num;
	
	public Node(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.num - this.num;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int a = 0, b = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++) {
			a += arr[i].num;
			b = Math.min(arr[i].time, b);
		}
		
		System.out.print(a + " " + b);
	}
}

class Node implements Comparable<Node>{
	int num, time;
	
	public Node(int num, int time) {
		this.num = num;
		this.time = time;
	}

	@Override
	public int compareTo(Node o) {
		if(o.num == this.num) {
			return o.time - this.time;
		}
		return o.num - this.num;
	}
}

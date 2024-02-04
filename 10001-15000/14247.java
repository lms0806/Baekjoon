import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		
		int[] num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = new Node(num[i], Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		long answer = 0;
		for(int i = 0; i < n; i++) {
			answer += arr[i].h + arr[i].a * i; 
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int h, a;
	
	public Node(int h, int a) {
		this.h = h;
		this.a = a;
	}

	@Override
	public int compareTo(Node o) {
		return this.a - o.a;
	}
}

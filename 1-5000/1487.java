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
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int answer = 0, max = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i ; j< n; j++) {
				int num = arr[i].a - arr[j].b;
				
				if(num > 0) {
					sum += num;
				}
			}
			
			if(max < sum) {
				max = sum;
				answer = arr[i].a;
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int a, b;
	
	public Node(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.a == o.a) {
			return this.b - o.b;
		}
		return this.a - o.a;
	}
}

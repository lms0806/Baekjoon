import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			sum += arr[i].weight;
		}
		
		if(sum < m) {
			System.out.print(-1);
			return;
		}
		
		Arrays.sort(arr);
		
		int sumWeight = 0, sumPrice = 0, beforePrice = 0, answer = Integer.MAX_VALUE;
		for(Node a : arr) {
			sumWeight += a.weight;
			
			if(beforePrice != a.price) {
				sumPrice = beforePrice = a.price;
			}
			else {
				sumPrice += a.price;
			}
			
			if(sumWeight >= m) {
				answer = Math.min(answer, sumPrice);
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int weight, price;
	
	public Node(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.price == o.price) {
			return o.weight - this.weight;
		}
		return this.price - o.price;
	}
}

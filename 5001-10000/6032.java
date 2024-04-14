import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
			
			arr[i] = new Node(i + 1, (int)b, a / b);
		}
		
		Arrays.sort(arr);
		
		int num = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			num += arr[i].price;
			
			sb.append(arr[i].idx).append("\n");
		}
		System.out.print(num + "\n" + sb);
	}
}

class Node implements Comparable<Node> {
	int idx, price;
	double num;
	
	public Node(int idx, int price, double num) {
		this.idx = idx;
		this.price = price;
		this.num = num;
	}
	@Override
	public int compareTo(Node o) {
		return this.num < o.num ? 1 : this.num > o.num ? -1 : 0;
	}
}

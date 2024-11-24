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
		
		int[] num = new int[n], count = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(num[j] <= arr[i].s) {
					num[j] = arr[i].e;
					count[j]++;
					break;
				}
			}
		}
		
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for(int a : count) {
			if(a != 0) {
				sb.append(a).append(" ");
				answer++;
			}
		}
		System.out.print(answer + "\n" + sb);
	}
}

class Node implements Comparable<Node> {
	int s, e;
	
	public Node(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.s - o.s;
	}
}

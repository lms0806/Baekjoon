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
		
		int answer = arr[0].e;
		for(int i = 0; i < arr.length; i++) {
			if(answer >= arr[i].e) {
				answer = arr[i].e - arr[i].s;
			}
			else {
				answer -= arr[i].s;
			}
		}
		
		System.out.print(answer >= 0 ? answer : -1);
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
		if(this.e == o.e) {
			return o.s - this.s;
		}
		return o.e - this.e;
	}
}

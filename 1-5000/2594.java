import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Node> arr = new ArrayList<>();
		arr.add(new Node(600, 600));
		arr.add(new Node(1320, 1302));
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			int s = a / 100 * 60 + a % 100 - 10, e = b / 100 * 60 + b % 100 + 10;
			
			arr.add(new Node(s, e));
		}
		
		Collections.sort(arr);
		
		int answer = 0, last = 600;
		for(Node a : arr) {
			answer = Math.max(answer, a.s - last);
			last = Math.max(last, a.e);
		}
		System.out.println(answer);
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
		if(this.s == o.s) {
			return this.e - o.e;
		}
		return this.s - o.s;
	}
}

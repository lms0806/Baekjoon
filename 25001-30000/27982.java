import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Node> arr = new ArrayList<>();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			arr.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		int[] dx = {1, -1, 0, 0, 0, 0};
		int[] dy = {0, 0, 1, -1, 0, 0};
		int[] dz = {0, 0, 0, 0, 1, -1};
		
		int answer = 0;
		for(Node n : arr) {
			int count = 0;
			for(int i = 0; i < 6; i++) {
				if(arr.contains(new Node(n.i + dx[i], n.j + dy[i], n.k + dz[i]))) {
					count++;
				}
				else {
					break;
				}
			}
			
			if(count == 6) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

class Node{
	int i, j, k;
	
	public Node(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public boolean equals(Object n) {
		Node now = (Node) n;
		return now.i == i && now.j == j && now.k == k;
	}
}

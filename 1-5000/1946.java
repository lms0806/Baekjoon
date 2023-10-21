import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			Node[] arr = new Node[n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			
			Arrays.sort(arr);
			
			int answer = 1;
			int max = arr[0].second;
			for(int i = 1; i < n; i++) {
				if(arr[i].second <= max) {
					answer++;
					max = arr[i].second;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int first, second;
	
	public Node(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Node o) {
		return this.first - o.first;
	}
}

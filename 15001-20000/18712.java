import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			Node[] node = new Node[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				node[i] = new Node(Integer.parseInt(st.nextToken()), arr[i]);
			}
			
			Arrays.sort(node);
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			for(int i = 0; i < n; i++) {
				if(node[i].calorie <= node[k - 1].calorie) {					
					pq.add(node[i].happy);
				}
			}
			
			long answer = 0;
			for(int i = 0; i < k; i++) {
				answer += pq.poll();
			}
			sb.append(node[k - 1].calorie).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int happy, calorie;
	
	public Node(int happy, int calorie) {
		this.happy = happy;
		this.calorie = calorie;
	}

	@Override
	public int compareTo(Node o) {
		if(this.calorie == o.calorie) {
			return o.happy - this.happy;
		}
		return this.calorie - o.calorie;
	}
}

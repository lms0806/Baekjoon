import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Node> list = new ArrayList<>();
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			list.add(new Node(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
		}
		
		System.out.print(dijkstra(arr));
	}
	
	public static int dijkstra(int[] arr) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		Map<String, Integer> map = new HashMap<>();
		
		pq.add(new Node(0, arr));
		map.put(Arrays.toString(arr), 0);
		
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(map.get(Arrays.toString(now.arr)) < now.cost) {
				continue;
			}

			for(Node next : list) {
				int s = next.s, e = next.e, cost = next.cost;

				int[] nowArr = now.arr.clone();
				
				int temp = nowArr[s];
				nowArr[s] = nowArr[e];
				nowArr[e] = temp;
				
				if(!map.containsKey(Arrays.toString(nowArr)) || map.get(Arrays.toString(nowArr)) > cost + now.cost) {
					map.put(Arrays.toString(nowArr), cost + now.cost);
					
					pq.add(new Node(cost + now.cost, nowArr));
				}
			}
		}
		
		Arrays.sort(arr);
		
		return map.containsKey(Arrays.toString(arr)) ? map.get(Arrays.toString(arr)) : -1;
	}
}

class Node implements Comparable<Node>{
	int[] arr;
	int s, e, cost;
	
	public Node(int s, int e, int cost) {
		this.s = s;
		this.e = e;
		this.cost = cost;
	}
	
	public Node(int cost, int[] arr) {
		this.cost = cost;
		this.arr = arr;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}

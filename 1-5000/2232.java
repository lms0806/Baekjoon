import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		Node[] node = new Node[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			node[i] = new Node(i, arr[i]);
		}
		
		Arrays.sort(node);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			if(arr[node[i].i] == -1) {
				continue;
			}
			
			list.add(node[i].i + 1);
			
			int cost = node[i].cost;
			for(int j = node[i].i + 1; j < n; j++) {
				if(arr[j] < cost) {
					cost = arr[j];
					arr[j] = -1;
				}
			}
			cost = node[i].cost;
			for(int j = node[i].i - 1; j >= 0; j--) {
				if(arr[j] < cost) {
					cost = arr[j];
					arr[j] = -1;
				}
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int l : list) {
			sb.append(l).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int i, cost;
	
	public Node(int i, int cost) {
		this.i = i;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return o.cost - this.cost;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		Jewel[] jewel = new Jewel[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			jewel[i] = new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(jewel);
		
		int[] bag = new int[k];
		for(int i = 0; i < k; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bag);
		
		int idx = 0;
		long answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < bag.length; i++) {
			while(idx < n && jewel[idx].weight <= bag[i]) {
				pq.add(jewel[idx++].cost);
			}
			
			if(!pq.isEmpty()) {
				answer += pq.poll();
			}
		}
		System.out.print(answer);
	}
}

class Jewel implements Comparable<Jewel>{
	int weight, cost;
	
	public Jewel(int weight, int cost) {
		this.weight = weight;
		this.cost = cost;
	}

	@Override
	public int compareTo(Jewel o) {
		return this.weight - o.weight;
	}
}

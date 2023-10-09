import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] problem = new int[5];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			problem[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Node> arr = new ArrayList<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			arr.add(new Node(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
		}
		
		Collections.sort(arr);
		
		int idx = 0, answer = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < problem[i]; j++) {
				answer += arr.get(idx++).time;
				
				if(j < problem[i] - 1) {
					answer += arr.get(idx).time - arr.get(idx - 1).time;
				}
			}
			
			if(i < 4) {
				answer += 60;
			}
			
			for(; idx < arr.size(); idx++) {
				if(arr.get(idx).number == i + 1) {
					break;
				}
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int number, time;
	
	public Node(int number, int time) {
		this.number = number;
		this.time = time;
	}

	@Override
	public int compareTo(Node o) {
		if(this.number == o.number) {
			return this.time - o.time;
		}
		return this.number - o.number;
	}
}

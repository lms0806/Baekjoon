import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<PriorityQueue<Integer>> arr = new ArrayList<>();
		
		int t = Integer.parseInt(br.readLine());
		
		int idx = 0;
		long answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int size = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				if(!map.containsKey(name)) {
					map.put(name, idx++);
					arr.add(new PriorityQueue<>(Collections.reverseOrder()));
				}
				
				while(size --> 0) {
					arr.get(map.get(name)).add(Integer.parseInt(st.nextToken()));
				}
			}
			else {
				if(!map.containsKey(name)) {
					continue;
				}
				
				int num = map.get(name);
				
				size = Math.min(size, arr.get(num).size());
				
				while(size --> 0) {
					answer += arr.get(num).poll();
				}
			}
		}

		System.out.print(answer);
	}
}

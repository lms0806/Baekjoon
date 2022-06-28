import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> arr = new ArrayList<>();
	static int[] d;
	static int k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		d = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(st.nextToken());
		}
		
		k = Integer.parseInt(br.readLine());
		
		bfs();
		
		Collections.sort(arr);
		
		int answer = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(answer != arr.get(i)) {
				break;
			}
			answer++;
		}
		
		System.out.print((answer % 2 == 0 ? "holsoon" :"jjaksoon") + " win at " + answer);
	}
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {0, 0});
		arr.add(0);
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			if(now[1] == k) {
				break;
			}
			
			for(int i = 0; i < d.length; i++) {
				int x = now[0] + d[i];
				
				if(x >= 0 && x < 1001 && !arr.contains(x)) {
					queue.add(new int[] {x, now[1] + 1});
					arr.add(x);
				}
			}
		}
	}
}

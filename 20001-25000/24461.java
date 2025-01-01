import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] count = new int[n];
		boolean[] check = new boolean[n];
		ArrayList<Integer>[] arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
			count[a]++;
			count[b]++;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			if(count[i] == 1) {
				queue.add(i);
				check[i] = true;
			}
		}
		
		while(true) {
			int size = queue.size();
			
			if(size <= 2) {
				break;
			}
			
			for(int i = 0; i < size; i++) {
				int s = queue.poll();
				
				count[s]--;
				
				for(int e : arr[s]) {
					if(!check[e]) {
						count[e]--;
						if(count[e] == 1) {
							check[e] = true;
							queue.add(e);
						}
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(count[i] != 0) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb);
	}
}

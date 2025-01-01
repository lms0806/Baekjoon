import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		ArrayList<int[]> arr = new ArrayList<>();
		
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		int answer = Integer.MIN_VALUE;
		for(int[] a : arr) {
			for(int[] b : arr) {
				int count = 0;
				for(int[] c : arr) {
					if(a[0] <= c[0] && c[0] <= a[0] + l && b[1] <= c[1] && c[1] <= b[1] + l) {
						count++;
					}
				}
				answer = Math.max(answer, count);
			}
		}
		System.out.print(k - answer);
	}
}

class Node {
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = n - Integer.parseInt(st.nextToken()) - 1;
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		int answer = arr[n - 1] - arr[0];
		Deque<Node> deque = new ArrayDeque<>();
		for(int i = 0; i < n - 1; i++) {
			Node now = new Node(i, arr[i + 1] - arr[i]);
			
			if(!deque.isEmpty() && deque.peekFirst().idx <= i - m) {
				deque.removeFirst();
			}
			
			while(!deque.isEmpty() && deque.peekLast().num > now.num) {
				deque.removeLast();
			}
			deque.addLast(now);
			
			if(i + 1 >= m) {
				answer = Math.min(answer, deque.peekFirst().num + arr[i + 1] - arr[i + 1 - m]);
			}
		}
		System.out.print(answer);
	}
}

class Node {
	int idx, num;
	
	public Node(int idx, int num) {
		this.idx = idx;
		this.num = num;
	}
}

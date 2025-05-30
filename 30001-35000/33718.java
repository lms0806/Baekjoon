import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static long t;
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Long.parseLong(br.readLine());
		
		long[] arr = new long[6];
		boolean check = false;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
			if(arr[i] == t) {
				check = true;
				break;
			}
		}
		
		System.out.print(check ? 0 : bfs(arr));
	}
	
	public static String bfs(long[] arr) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(arr, "", 0));
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			int len = now.arr.length;
			
			if(len == 1) {
				continue;
			}
			
			if(now.arr[len - 1] == t) {
				return now.count + now.s;
			}
			
			for(int i = 0; i < len; i++) {
				for(int j = i + 1; j < len; j++) {					
					long a = Math.max(now.arr[i], now.arr[j]);
					long b = Math.min(now.arr[i], now.arr[j]);

					int idx = 0;
					long[] arr2 = new long[len - 1];
					for(int k = 0; k < len; k++) {
						if(k == i || k == j) {
							continue;
						}
						arr2[idx++] = now.arr[k];
					}
					
					long num = 0;
					for(char c : "+-*/".toCharArray()) {
						if(c == '+') {
							num = a + b;
						}
						else if(c == '-') {
							if(a == b) {
								continue;
							}
							num = a - b;
						}
						else if(c == '*') {
							num = a * b;
						}
						else {
							if(a % b != 0) {
								continue;
							}
							num = a / b;
						}
						long[] arr3 = arr2.clone();
						arr3[arr2.length - 1] = num;
						queue.add(new Node(arr3, String.format("%s\n%d %c %d = %d", now.s, a, c, b, num), now.count + 1));
						
						if(num == t) {
							return (now.count + 1) + String.format("%s\n%d %c %d = %d", now.s, a, c, b, num);
						}
					}
				}
			}
		}
		return "-1";
	}
}

class Node {
	long[] arr;
	String s;
	int count;
	
	public Node(long[] arr, String s, int count) {
		this.arr = arr;
		this.s = s;
		this.count = count;
	}
}

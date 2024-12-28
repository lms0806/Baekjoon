import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[] price = new long[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		
		Node[] arr = new Node[3];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			arr[i] = new Node(price[i], Long.parseLong(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		long num = Long.parseLong(br.readLine());
		
		long answer = 0;
		for(Node a : arr) {
			long count = a.price == 0 ? a.count : Math.min(num / a.price, a.count);
			
			num -= count * a.price;
			answer += count;
			if(count < a.count) {
				break;
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	long price, count;
	
	public Node(long price, long count) {
		this.price = price;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.price > o.price ? 1 : -1;
	}
}

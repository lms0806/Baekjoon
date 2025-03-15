import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

        ArrayList<Node> list = new ArrayList<>();
		long nowSum = 0, prevSum = 0;

	    for (int i = 1; i <= k; i++) {
	    	nowSum += arr[i] * i;
	        prevSum += arr[i];
	    }
	    list.add(new Node(1, nowSum));

	    for(int i = 2; i <= n - k + 1; i++) {
	    	nowSum -= prevSum;
	    	nowSum += arr[i + k - 1] * k;

	        prevSum = prevSum - arr[i - 1] + arr[i + k - 1];

            list.add(new Node(i, nowSum));
        }
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : list) {
			sb.append(node.idx).append(" ").append(node.num).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	int idx;
	long num;
	
	public Node(int idx, long num) {
		this.idx = idx;
		this.num = num;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.num == o.num) {
			return this.idx - o.idx;
		}
		return Long.compare(this.num, o.num);
	}
}

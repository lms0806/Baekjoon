import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	long sum = 0;
    	Node[] arr = new Node[n];
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		arr[i] = new Node(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
    		sum += arr[i].a;
    	}
    	
    	Arrays.sort(arr);
    	
    	long num = 0, answer = 0;
    	for(int i = 0; i < n; i++) {
    		num += arr[i].a;
    		
    		if(num >= (sum + 1) / 2) {
    			answer = arr[i].x;
    			break;
    		}
    	}
    	System.out.print(answer);
    }
}

class Node implements Comparable<Node> {
	long x, a;
	
	public Node(long x, long a) {
		this.x = x;
		this.a = a;
	}
	
	@Override
	public int compareTo(Node o) {
		return (int)(this.x - o.x);
	}
}

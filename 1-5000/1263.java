import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	Node[] arr = new Node[n];
    	
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    	}
    	
    	Arrays.sort(arr);
    	
    	int answer = Integer.MAX_VALUE;
    	for(Node now : arr) {
    		answer = Math.min(answer, now.s) - now.t;
    		
    		if(answer < 0) {
    			answer = -1;
    			break;
    		}
    	}
    	System.out.print(answer);
    }
}

class Node implements Comparable<Node> {
	int s, t;
	
	public Node(int t, int s) {
		this.t = t;
		this.s = s;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.s - this.s;
	}
}

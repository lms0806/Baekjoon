import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Node[] arr = new Node[n];
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	st.nextToken();
        	arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        Arrays.sort(arr);
        
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
        	if(pq.isEmpty()) {
        		answer++;
        	}
        	else {
        		if(pq.peek() > arr[i].s) {
        			answer++;
        		}
        		else {
        			pq.poll();
        		}
        	}
        	pq.add(arr[i].e);
        }
        System.out.print(answer);
    }
}

class Node implements Comparable<Node> {
	int s, e;
	
	public Node(int s, int e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Node o) {
		return this.s - o.s;
	}
}

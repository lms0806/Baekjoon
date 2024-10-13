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
        	String[] ss = st.nextToken().split(":"), se = st.nextToken().split(":");
        	long s = Long.parseLong(ss[0]) * 60 * 60* 1000 + Long.parseLong(ss[1]) * 60 * 1000 + Long.parseLong(ss[2].split("\\.")[0]) * 1000 + Long.parseLong(ss[2].split("\\.")[1]);
        	long e = Long.parseLong(se[0]) * 60 * 60* 1000 + Long.parseLong(se[1]) * 60 * 1000 + Long.parseLong(se[2].split("\\.")[0]) * 1000 + Long.parseLong(se[2].split("\\.")[1]);
        	
        	arr[i] = new Node(s, e);
        }
        
        Arrays.sort(arr);
        
        int answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
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
	long s, e;
	
	public Node(long s, long e) {
		this.s = s;
		this.e = e;
	}

	@Override
	public int compareTo(Node o) {
		return (int) (this.s - o.s);
	}
}

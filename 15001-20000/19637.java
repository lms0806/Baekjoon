import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        Node[] arr = new Node[n];
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	arr[i] = new Node(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
        
        StringBuilder sb = new StringBuilder();
        while(m --> 0) {
        	int num = Integer.parseInt(br.readLine());
        	
        	int s = 0, e = n - 1;
        	while(s <= e) {
        		int mid = (s + e) / 2;
        		
        		if(arr[mid].cost < num) {
        			s = mid + 1;
        		}
        		else {
        			e = mid - 1;
        		}
        	}
        	sb.append(arr[s].s).append("\n");
        }
        System.out.print(sb);
    }
}

class Node implements Comparable<Node>{
	String s;
	int cost;
	
	public Node(String s, int cost) {
		this.s = s;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}

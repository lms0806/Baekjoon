import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Node[] arr = new Node[n];
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        
        Arrays.sort(arr);
        
        long answer = 0;
        for(int i = 0; i < n; i++) {
        	int num = Integer.MAX_VALUE;
        	if(i > 0 && arr[i].y == arr[i - 1].y) {
        		num = Math.min(arr[i].x - arr[i - 1].x, num);
        	}
        	if(i < n - 1 && arr[i].y == arr[i + 1].y) {
        		num = Math.min(arr[i + 1].x - arr[i].x, num);
        	}
        	answer += num == Integer.MAX_VALUE ? 0 : num;
        }
        System.out.print(answer);
    }
}

class Node implements Comparable<Node>{
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.y == o.y) {
			return this.x - o.x;
		}
		return this.y - o.y;
	}
}

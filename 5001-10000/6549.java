import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int n = Integer.parseInt(st.nextToken());
        	
        	if(n == 0) {
        		break;
        	}
        	
        	long[] arr = new long[n + 1];
        	for(int i = 0; i < n; i++) {
        		arr[i] = Long.parseLong(st.nextToken());
        	}
        	
        	long answer = 0;
        	Stack<Node> stack = new Stack<>();
        	for(int i = 0; i <= n; i++) {
        		int idx = i;
        		
        		while(!stack.isEmpty() && stack.peek().num >= arr[i]) {
        			idx = stack.peek().idx;
        			
        			answer = Math.max(answer, (i - idx) * stack.pop().num);
        		}
        		
        		stack.add(new Node(idx, arr[i]));
        	}
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}

class Node {
	int idx;
	long num;
	
	public Node(int idx, long num) {
		this.idx = idx;
		this.num = num;
	}
}

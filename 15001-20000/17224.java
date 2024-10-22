import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		int easy = Integer.parseInt(st.nextToken()), hard = Integer.parseInt(st.nextToken());
    		
    		if(hard <= l) {
    			arr[i] = 140;
    		}
    		else if(easy <= l) {
    			arr[i] = 100;
    		}
    	}
    	
    	Arrays.sort(arr);
    	
    	int answer = 0;
    	for(int i = n - 1; i >= n - k; i--) {
    		answer += arr[i];
    	}
    	System.out.print(answer);
    }
}

class Node implements Comparable<Node>{
	int easy, hard;
	
	public Node(int easy, int hard) {
		this.easy = easy;
		this.hard = hard;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.hard == o.hard) {
			return this.easy - o.easy;
		}
		return this.hard - o.hard;
	}
}

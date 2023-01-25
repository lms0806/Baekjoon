import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i = 1; i < n; i++) {
			answer = Math.max(answer, Math.abs(arr[i].height - arr[i - 1].height));
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int male, height;

	public Node(int male, int height) {
		this.male = male;
		this.height = height;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.male == 0) {
			if(o.male == 0) {
				return o.height - this.height;
			}
			else {
				return -1;
			}
		}
		if(o.male == 0) {
			return 1;
		}
		return o.height - this.height;
	}
}

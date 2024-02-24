import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double[] score = {0.56, 0.24, 0.14, 0.06, 0.3};
		Node[] arr = new Node[6];
		for(int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			double sum = 0;
			for(int j = 0; j < 5; j++) {
				sum += Double.parseDouble(st.nextToken()) * score[j];
			}
			
			arr[i] = new Node(s, sum);
		}
		
		Arrays.sort(arr);
		
		int[] sl = new int[6];
		for(int i = 0; i < n; i++) {
			sl[i % 6]++;
		}
		
		for(int i = 0; i < 6; i++) {
			if(arr[i].name.equals("Taiwan")) {
				System.out.print(sl[i]);
				break;
			}
		}
		
	}
}

class Node implements Comparable<Node>{
	String name;
	double sum;
	
	public Node(String name, double sum) {
		this.name = name;
		this.sum = sum;
	}

	@Override
	public int compareTo(Node o) {
		if(this.sum < o.sum) {
			return 1;
		}
		return -1;
	}
}

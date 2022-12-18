import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		ArrayList<Node> arr = new ArrayList<>();
		while((s = br.readLine()) != null){
			StringTokenizer st = new StringTokenizer(s);
			
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			double sum = num * Double.parseDouble(st.nextToken());
			
			arr.add(new Node(name, num, sum));
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node a : arr) {
			sb.append("$").append(String.format("%.2f", a.sum)).append(" - ").append(a.name).append("/").append(a.num).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	int num;
	double sum;
	
	public Node(String name, int num, double sum) {
		this.name = name;
		this.num = num;
		this.sum = sum;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.sum < o.sum) {
			return 1;
		}
		else if(this.sum == o.sum) {
			if(this.num == o.num) {
				return this.name.compareTo(o.name);
			}
			return o.num - this.num;
		}
		return -1;
	}
}

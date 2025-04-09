import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < 7; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			set.add(change(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<Node> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			if(!set.contains(change(m, d))) {
				arr.add(new Node(m, d));
			}
		}
		
		Collections.sort(arr);
		
		for(Node now : arr) {
			sb.append(now.m).append(" ").append(now.d).append("\n");
		}
		System.out.print(sb.length() == 0 ? "ALL FAILED" : sb);
	}
	
	public static int change(int m, int d) {
		if(m == 1) {
			return d < 20 ? 11 : 0;
		}
		else if(m == 2) {
			return d < 19 ? 0 : 1;
		}
		else if(m == 3) {
			return d < 21 ? 1 : 2;
		}
		else if(m == 4) {
			return d < 20 ? 2 : 3;
		}
		else if(m == 5) {
			return d < 21 ? 3 : 4;
		}
		else if(m == 6) {
			return d < 22 ? 4 : 5;
		}
		else if(m == 7) {
			return d < 23 ? 5 : 6;
		}
		else if(m == 8) { 
			return d < 23 ? 6 : 7;
		}
		else if(m == 9) {
			return d < 23 ? 7 : 8;
		}
		else if(m == 10) {
			return d < 23 ? 8 : 9;
		}
		else if(m == 11) {
			return d < 23 ? 9 : 10;
		}
		else {
			return d < 22 ? 10 : 11;
		}
	}
}

class Node implements Comparable<Node> {
	int m, d;
	
	public Node(int m, int d) {
		this.m = m;
		this.d = d;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.m == o.m ? this.d - o.d : this.m - o.m;
	}
}

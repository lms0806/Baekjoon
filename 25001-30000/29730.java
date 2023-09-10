import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Node> b = new ArrayList<>();
		
		while(t --> 0) {
			String s = br.readLine();
			
			if(s.startsWith("boj.kr/")) {
				a.add(Integer.parseInt(s.substring(7)));
			}
			else {
				b.add(new Node(s));
			}
		}
		
		Collections.sort(a);
		Collections.sort(b);
		
		StringBuilder sb = new StringBuilder();
		for(Node n : b) {
			sb.append(n.s).append("\n");
		}
		for(Integer s : a) {
			sb.append("boj.kr/").append(s).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String s;
	
	public Node(String s) {
		this.s = s;
	}

	@Override
	public int compareTo(Node o) {
		if(o.s.length() == this.s.length()) {
			return this.s.compareTo(o.s);
		}
		return this.s.length() - o.s.length();
	}
}

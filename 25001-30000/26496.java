import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {			
			LinkedHashSet<String> set = new LinkedHashSet<>();
			for(int i = 0; i < s.length(); i++) {
				for(int j = i + 1; j <= s.length(); j++) {
					String str = s.substring(i, j);
					
					if(str.equals(new StringBuilder(str).reverse().toString())) {
						set.add(str);
					}
				}
			}
			
			int idx = 0;
			ArrayList<Node> arr = new ArrayList<>();
			for(String str : set) {
				arr.add(new Node(str, idx++));
			}
			
			Collections.sort(arr);
			
			sb.append(set.size()).append(" - ");
			for(Node node : arr) {
				sb.append("\"").append(node.s).append("\" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String s;
	int idx;
	
	public Node(String s, int idx) {
		this.s = s;
		this.idx = idx;
	}

	@Override
	public int compareTo(Node o) {
		if(this.s.length() == o.s.length()) {
			return this.idx - o.idx;
		}
		return this.s.length() - o.s.length();
	}
}

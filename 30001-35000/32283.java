import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	static int n;
	static ArrayList<Node> arr = new ArrayList<>();
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		dfs(0, 0, "");
		
		Collections.sort(arr);
		
		String str = br.readLine();
		for(int i = 0; i < arr.size(); i++) {
			if(new StringBuilder(arr.get(i).s).reverse().toString().equals(str)) {
				System.out.print(i);
			}
		}
	}
	
	public static void dfs(int depth, int size, String s) {
		if(depth == n) {
			arr.add(new Node(s, s.replaceAll("0", "").length()));
			return;
		}
		
		dfs(depth + 1, size + 1, s + "0");
		dfs(depth + 1, size + 1, s + "1");
	}
}

class Node implements Comparable<Node>{
	String s;
	int count;
	
	public Node(String s, int count) {
		this.s = s;
		this.count = count;
	}

	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.s.compareTo(o.s);
		}
		return this.count - o.count;
	}
}

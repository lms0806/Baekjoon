import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int idx = 0;
		List<Node> arr = new ArrayList<>();
		for(char c : br.readLine().toCharArray()) {
			arr.add(new Node(c, idx++));
		}
		
		Collections.sort(arr);
		
		String s = br.readLine();
		
		int n = arr.size(), m = s.length() / arr.size();
		
		char[][] answer = new char[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				answer[arr.get(i).idx][j] = s.charAt(i * m + j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(answer[j][i]);
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	char c;
	int idx;
	
	public Node(char c, int idx) {
		this.c = c;
		this.idx = idx;
	}

	@Override
	public int compareTo(Node o) {
		if(this.c == o.c) {
			return this.idx - o.idx;
		}
		return this.c - o.c;
	}
}

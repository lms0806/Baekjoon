import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), ".");
			
			arr[i] = new Node(st.nextToken(), st.nextToken());
		}
		
		while(m --> 0) {
			set.add(br.readLine());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node now : arr) {
			sb.append(now.filename).append(".").append(now.extension).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Node implements Comparable<Node> {
		String filename, extension;
		
		public Node(String filename, String extension) {
			this.filename = filename;
			this.extension = extension;
		}
		
		@Override
		public int compareTo(Node o) {
			if(this.filename.equals(o.filename)) {
				if(set.contains(this.extension)) {
					if(set.contains(o.extension)) {
						return this.extension.compareTo(o.extension);
					}
					return -1;
				}
				
				if(set.contains(o.extension)) {
					return 1;
				}
				return this.extension.compareTo(o.extension);
			}
			return this.filename.compareTo(o.filename);
		}
	}
}

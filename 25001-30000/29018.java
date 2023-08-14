import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			Node[] arr = new Node[s.length()];
			
			for(int i = 0; i < s.length(); i++) {
				arr[i] = new Node(s.charAt(i));
			}
			
			Arrays.sort(arr);
			
			for(Node a : arr) {
				sb.append(a.c);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	char c;
	
	public Node(char c) {
		this.c = c;
	}

	@Override
	public int compareTo(Node o) {
		int a = check(this.c), b = check(o.c);
		
		return a == b ? this.c - o.c : a - b;
	}
	
	public int check(char c) {
		return c >= 'a' && c <= 'z' ? 0 : c >= 'A' && c <= 'Z' ? 1 : 2;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		String s = br.readLine();
		int x = s.charAt(0) - 'a', y = s.charAt(1) - '0';
		
		int[] dx = {-a, -a, -b, -b, b, b, a, a};
		int[] dy = {-b, b, -a, a, -a, a, -b, b};
		
		TreeSet<Node> set = new TreeSet<>((o1, o2) -> o1.c == o2.c ? o1.n - o2.n : o1.c - o2.c);
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i], ny = y + dy[i];
			
			if(nx >= 0 && nx < 8 && ny > 0 && ny <= 8) {
				set.add(new Node((char)(nx + 'a'), ny));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(set.size()).append("\n");
		for(Node ar : set) {
			sb.append(ar.c).append(ar.n).append(" ");
		}
		System.out.print(sb);
	}
}

class Node {
	char c;
	int n;
	
	public Node(char c, int n) {
		this.c = c;
		this.n = n;
	}
}

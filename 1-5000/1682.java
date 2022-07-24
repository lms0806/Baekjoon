import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine().replaceAll(" ", "");
		System.out.print(bfs(s.substring(0, 4) + new StringBuilder(s.substring(4)).reverse().toString()));
	}
	
	public static int bfs(String str) {
		Queue<Node> queue = new LinkedList<>();
		HashSet<String> set = new HashSet<>();
		queue.add(new Node("12348765", 0));
		set.add("12348765");
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.s.equals(str)) {
				return now.count;
			}
			
			for(int i = 0; i < 4; i++) {
				String strs = changes(i, now.s);
				if(!set.contains(strs)) {
					queue.add(new Node(strs, now.count + 1));
					set.add(strs);
				}
			}
		}
		return 0;
	}
	
	public static String changes(int a, String s) {
		String changes = "";
		if(a == 0) {
			changes = s.substring(4) + s.substring(0, 4);
		}
		else if(a == 1) {
			changes = s.charAt(3) + s.substring(0, 3) + s.charAt(7) + s.substring(4, 7);
		}
		else if(a == 2) {
			changes = s.charAt(0) + "" + s.charAt(2) + "" + s.charAt(6) + "" + s.charAt(3);
			changes += s.charAt(4) + "" + s.charAt(1) + "" + s.charAt(5) + "" + s.charAt(7); 
		}
		else {
			changes = s.charAt(7) + s.substring(1, 7) + s.charAt(0);
		}
		return changes;
	}
}

class Node{
	String s;
	int count;
	
	public Node(String s, int count) {
		this.s = s;
		this.count = count;
	}
}

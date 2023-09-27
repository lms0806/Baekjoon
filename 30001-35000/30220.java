import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Long> map = new HashMap<>();
		TreeSet<Node> set = new TreeSet<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			long salary = Long.parseLong(st.nextToken());
			
			map.put(name, salary);
			set.add(new Node(name, salary));
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == 1) {
				String name = st.nextToken();
				long plus = Long.parseLong(st.nextToken());
				
				set.remove(new Node(name, map.get(name)));
				set.add(new Node(name, map.get(name) + plus));
				map.put(name, map.get(name) + plus);
			}
			else {
				Node node = set.iterator().next();
				sb.append(node.name).append(" ").append(node.salary).append("\n");
				set.remove(node);
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	long salary;
	
	public Node(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Node o) {
		if(o.salary == this.salary) {
			return this.name.compareTo(o.name);
		}
		return (int)(o.salary - this.salary);
	}
}

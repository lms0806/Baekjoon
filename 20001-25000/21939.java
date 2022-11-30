import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		TreeSet<Problem> set = new TreeSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			set.add(new Problem(p, l));
			map.put(p, l);
		}
		
		t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String choice = st.nextToken();
			
			if(choice.equals("recommend")) {
				sb.append(Integer.parseInt(st.nextToken()) == 1 ? set.last().p : set.first().p).append("\n");
			}
			else if(choice.equals("add")) {
				int p = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
				
				set.add(new Problem(p, l));
				map.put(p, l);
			}
			else {
				int num = Integer.parseInt(st.nextToken());
				
				set.remove(new Problem(num, map.get(num)));
				map.remove(num);
			}
		}
		System.out.print(sb);
	}
}

class Problem implements Comparable<Problem>{
	int p, l;
	
	public Problem(int p, int l) {
		this.p = p;
		this.l = l;
	}

	@Override
	public int compareTo(Problem o) {
		if(this.l == o.l) {
			return this.p - o.p;
		}
		return this.l - o.l;
	}
}

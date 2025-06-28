import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        br.readLine();
		
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		
		String s;
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			int human = Integer.parseInt(st.nextToken());
			int tree = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(human)) {
				map.put(human, new HashSet<>());
			}
			
			map.get(human).add(tree);
		}
		
		HashSet<String> set = new HashSet<>();
		for(int key : map.keySet()) {
			set.add(map.get(key).toString());
		}
		System.out.print(set.size());
	}	
}

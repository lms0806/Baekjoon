import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			TreeMap<Character, Integer> map = new TreeMap<>();
			
			for(char c : br.readLine().toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			
			List<Integer> valueList = new ArrayList<>(map.values());
	        Collections.sort(valueList);
	        
	        int sum = 0;
	        for(int i = 0; i < valueList.size() - 2; i++) {
	        	sum += valueList.get(i);
	        }
	        sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int idx = 0;
		for(Integer key : map.keySet()) {
			if(idx == 2) {
				System.out.print(key + " " + map.get(key));
				break;
			}
			idx++;
		}
	}
}

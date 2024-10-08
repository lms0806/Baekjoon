import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine());
		
		TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int sum = 0;
		for(int value : map.values()) {
			sum += value;
			
			if((k -= value) < 1) {
				break;
			}
		}
		System.out.print(sum);
	}
}

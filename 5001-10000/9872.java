import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			ArrayList<String> arr = new ArrayList<>();
			while(st.hasMoreTokens()) {
				arr.add(st.nextToken());
			}
			
			Collections.sort(arr);
			
			String s = arr.toString();
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		int max = 0;
		for(String key : map.keySet()) {
			max = Math.max(max, map.get(key));
		}
		System.out.print(max);
	}
}

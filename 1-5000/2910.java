import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
		}
		
		ArrayList<Integer> arr = new ArrayList<>(map.keySet());
		
		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return Integer.compare(map.get(b), map.get(a));
			}
		});
		
		StringBuilder sb = new StringBuilder();
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext()) {
			int num = iter.next();
			
			for(int i = 0; i < map.get(num); i++) {
				sb.append(num).append(" ");
			}
		}
		System.out.print(sb);
	}
}

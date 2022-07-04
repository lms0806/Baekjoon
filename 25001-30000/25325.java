import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> map = new TreeMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				map.put(s, map.get(s) + 1);
			}
		}
		
		ArrayList<Entry<String, Integer>> arr = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(arr, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(Entry<String, Integer> entry : arr) {
			sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n"); 
		}
		System.out.print(sb);
	}
}

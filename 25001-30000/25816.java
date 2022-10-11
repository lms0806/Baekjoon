import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		TreeMap<String, Double> map = new TreeMap<>(), countmap = new TreeMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			String s = br.readLine();
			
			map.put(s, map.containsKey(s) ? map.get(s) + i : i);
			countmap.put(s, countmap.containsKey(s) ? countmap.get(s) + 1 : 1);
		}
		
		for(String key : countmap.keySet()) {
			map.put(key, map.get(key) / countmap.get(key));
		}
		
		List<Entry<String, Double>> list_entries = new ArrayList<Entry<String, Double>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Double>>() {
			public int compare(Entry<String, Double> obj1, Entry<String, Double> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(Entry<String, Double> entry : list_entries) {
			sb.append(entry.getKey()).append("\n");
		}
		System.out.print(sb);
	}
}

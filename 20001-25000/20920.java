import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			String s = br.readLine();
			
			if(s.length() < m) {
				continue;
			}
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		ArrayList<String> arr = new ArrayList<>(map.keySet());
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int oc1 = map.get(o1);
				int oc2 = map.get(o2);
				if(oc1 == oc2) {
					if(o1.length() == o2.length()) {
						return o1.compareTo(o2);
					}
					return o2.length() - o1.length();
				}
				return oc2 - oc1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}

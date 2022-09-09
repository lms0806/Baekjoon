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
		
		ArrayList<String> arr = new ArrayList<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			
			if(map.get(s) >= 2 && !arr.contains(s)) {
				arr.add(s);
			}
		}
		
		Collections.sort(arr);
		
		System.out.print(arr.get(arr.size() - 1) + " " + map.get(arr.get(arr.size() - 1)));
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(size --> 0) {
			String s = br.readLine();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		ArrayList<String> arr = new ArrayList<>();
		
		int answer = 0;
		Iterator<String> iter = map.keySet().iterator(); 
		while(iter.hasNext()) { 
			String key = iter.next(); 
			int value = map.get(key); 
			
			if(value > answer) {
				answer = value;
				arr.clear();
				arr.add(key);
			}
			else if(value == answer) {
				arr.add(key);
			}
		}

		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}

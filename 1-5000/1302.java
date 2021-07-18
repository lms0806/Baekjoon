import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(size --> 0) {
			String str = br.readLine();
			map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
		}
		
		int max = 0;
		for(String s : map.keySet()) {
			max = Math.max(max, map.get(s));
		}
		
		ArrayList<String> arr = new ArrayList<>(map.keySet());
		
		Collections.sort(arr);
		
		for(String s : arr) {
			if(map.get(s) == max) {
				System.out.print(s);
				break;
			}
		}
	}
}

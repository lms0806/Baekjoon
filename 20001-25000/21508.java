import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			String s = br.readLine().replaceAll("\\s", "").replaceAll("[a-zA-Z]", "");
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		ArrayList<String>[] arr = new ArrayList[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int count = 0;
		for(String key : map.keySet()) {
			if(map.get(key) <= 5) {
				arr[map.get(key) - 1].add(key);
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(count).append("\n");
		for(int i = 0; i < 5; i++) {
			for(String s : arr[i]) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
}

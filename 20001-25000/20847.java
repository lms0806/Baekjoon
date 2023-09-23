import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<String, Node> map = new HashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int love = Integer.parseInt(st.nextToken());
			String day = st.nextToken();
			
			if(map.containsKey(day)) {
				if(map.get(day).love < love) {
					map.put(day, new Node(name, love));
				}
			}
			else {
				map.put(day, new Node(name, love));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(map.size()).append("\n");
		
		ArrayList<String> arr = new ArrayList<>();
		for(String key : map.keySet()) {
			arr.add(map.get(key).name);
		}
		
		Collections.sort(arr);
		
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}

class Node{
	String name;
	int love;
	
	public Node(String name, int love) {
		this.name = name;
		this.love = love;
	}
}

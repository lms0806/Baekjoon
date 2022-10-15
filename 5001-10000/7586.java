import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			while(true) {
				String str = br.readLine();
				
				if(str.equals("00A")) {
					break;
				}
				
				String[] strs = str.split(" ");
				int num = point(strs[1].charAt(0));
				
				map.put(strs[0], map.containsKey(strs[0]) ? map.get(strs[0]) + num : num);
			}
			
			int count = 0;
			for(String str : map.keySet()) {
				if(map.get(str) >= 200) {
					count++;
				}
			}
			
			sb.append(s).append(" ").append(count).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int point(char c) {
		if(c == 'L') {
			return 120;
		}
		if(c == 'S' || c == 'B') {
			return 150;
		}
		if(c == 'N') {
			return 40;
		}
		if(c == 'C') {
			return 160;
		}
		if(c == 'D' || c == 'R' || c == 'O') {
			return 100;
		}
		return 0;
	}
}

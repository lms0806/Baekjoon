import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		while(t --> 0) {
			String s = br.readLine().replaceAll("-", "");
			
			StringBuilder sb = new StringBuilder();
			int count = 0;
			for(char c : s.toCharArray()) {
				if(c >= '0' && c <= '9') {
					sb.append(c);
				}
				else if(c <= 'C') {
					sb.append(2);
				}
				else if(c <= 'F') {
					sb.append(3);
				}
				else if(c <= 'I') {
					sb.append(4);
				}
				else if(c <= 'L') {
					sb.append(5);
				}
				else if(c <= 'O') {
					sb.append(6);
				}
				else if(c <= 'S') {
					sb.append(7);
				}
				else if(c <= 'V') {
					sb.append(8);
				}
				else {
					sb.append(9);
				}
				
				if(count == 2) {
					sb.append("-");
				}
				count++;
			}
			
			s = sb.toString();
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) >= 2) {
				sb.append(key).append(" ").append(map.get(key)).append("\n");
			}
		}
		System.out.print(sb.length() == 0 ? "No duplicates." : sb);
	}
}

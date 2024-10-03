import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : br.readLine().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) % 2 != 0) {
				if(c != 'v') {
					s = new StringBuilder(s).reverse().toString();
				}
				
				StringBuilder sb = new StringBuilder();
				for(char ch : s.toCharArray()) {
					if(c == 'h') {
						sb.append(ch == 'q' ? 'p' : ch == 'p' ? 'q' : ch == 'b' ? 'd' : 'b');
					}
					else if(c == 'v') {
						sb.append(ch == 'b' ? 'p' : ch == 'p' ? 'b' : ch == 'q' ? 'd' : 'q');
					}
					else {
						sb.append(ch == 'q' ? 'b' : ch == 'b' ? 'q' : ch == 'p' ? 'd' : 'p');
					}
				}
				
				s = sb.toString();
			}
		}
		System.out.print(s);
	}
}

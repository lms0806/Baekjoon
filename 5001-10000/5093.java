import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = {'*', '?', '/', '+', '!'};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			HashMap<Character, Character> map = new HashMap<>();
			
			int idx = 0;
			boolean[] alpha= new boolean[26];
			for(char c : s.toCharArray()) {
				if(c >= 'A' && c <= 'Z') {
					if(alpha[c - 'A']) {
						if(!map.containsKey(c)) {
							map.put(c, ch[idx]);
							idx++;
						}
						sb.append(map.get(c));
					}
					else {
						sb.append(c);
					}
					alpha[c - 'A'] = true;
				}
				else {
					if(alpha[c - 'a']) {
						if(!map.containsKey(c)) {
							map.put(c, ch[idx]);
							idx++;
						}
						sb.append(map.get(c));
					}
					else {
						sb.append(c);
					}
					alpha[c - 'a'] = true;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

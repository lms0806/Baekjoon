import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		HashMap<Character, Character> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, c);
		}
		
		int t = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 1) {
				char a = st.nextToken().charAt(0), b = st.nextToken().charAt(0);
				
				for(Character c : map.keySet()) {
					if(map.get(c) == a) {
						map.put(c, b);
					}
				}
			}
			else {
				for(char c : s.toCharArray()) {
					sb.append(map.get(c));
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}

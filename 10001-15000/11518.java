import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Character, String> map = new HashMap<>();
		for(int i = 0; i < 26; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map.put(st.nextToken().charAt(0), st.nextToken());
		}
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, String> word = new HashMap<>();
		while(n --> 0) {
			StringBuilder sb = new StringBuilder();
			String s = br.readLine();
			for(char c : s.toCharArray()) {
				sb.append(map.get(c));
			}
			word.put(sb.toString(), s);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int w = Integer.parseInt(br.readLine());
			
			if(w == 0) {
				break;
			}
			
			String[] str = new String[w];
			for(int i = 0; i < w; i++) {
				str[i] = br.readLine();
			}
			
			sb.append(solve(word, str)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(HashMap<String, String> map, String[] str) {
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			if(!map.containsKey(s)) {
				return s + " not in dictionary.";
			}
			sb.append(map.get(s)).append(" ");
		}
		return sb.toString();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static HashMap<String, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			map.put(s, map.getOrDefault(s, 0) + num);
		}
		
		System.out.print(solve() ? "Delicious!" : "Not Delicious...");
	}
	
	public static boolean solve() {
		for(String a : map.keySet()) {
			for(String b : map.keySet()) {
				if(a.equals(b)) {
					continue;
				}
				
				if((int)(map.get(a) * 1.618) == map.get(b)) {
					return true;
				}
			}
		}
		return false;
	}
}

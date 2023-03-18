import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static HashMap<String, ArrayList<String>> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			if(!map.containsKey(a)) {
				map.put(a, new ArrayList<>());
			}
			
			map.get(a).add(b);
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken(), s2 = st.nextToken();
		
		System.out.print(check(s1, s2) || check(s2, s1) ? 1 : 0);
	}
	
	public static boolean check(String s1, String s2) {
		if(s1.equals(s2)) {
			return true;
		}
		
		if(map.get(s1) == null) {
			return false;
		}
		
		for(String s : map.get(s1)) {
			if(check(s, s2)) {
				return true;
			}
		}
		return false;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> set = new HashSet<>();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			set.add(br.readLine());
		}
		
		n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {			
			sb.append(solve(set, br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(HashSet<String> set, String s) {
		if(set.contains(s)) {
			return 1;
		}
		for(String key : set) {
			for(String key2 : set) {				
				if(s.equals(key + key2)) {
					return 2;
				}
			}
		}
		return 0;
	}
}

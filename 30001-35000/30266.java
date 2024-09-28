import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			int n = Integer.parseInt(br.readLine());
			
			HashSet<Character> set = new HashSet<>();
			for(char c : br.readLine().toCharArray()) {
				set.add(c);
			}
			
			int answer = 0;
			while(n --> 0) {
				if(solve(set, br.readLine())) {
					answer++;
				}
			}
			
			sb.append("Data Set ").append(t).append(":").append("\n");
			sb.append(answer).append("\n\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(HashSet<Character> set, String s) {
		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				return true;
			}
		}
		return false;
	}
}

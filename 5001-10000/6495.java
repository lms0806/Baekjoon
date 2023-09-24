import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(p --> 0) {
			st = new StringTokenizer(br.readLine());
			
			map.put(st.nextToken(), (int)(Double.parseDouble(st.nextToken()) * 10));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= q; t++) {
			String[] s = br.readLine().split(" ");
			
			double sum = 0;
			for(int i = 0; i < s.length - 2; i += 2) {
				sum += map.get(s[i]);
			}
			
			sb.append("Guess #").append(t).append(" was ").append(check(sum, s[s.length - 2], Integer.parseInt(s[s.length - 1]) * 10) ? "correct" : "incorrect").append(".\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(double sum, String checker, double num) {
		if(checker.equals("<")) {
			return sum < num;
		}
		if(checker.equals(">")) {
			return sum > num;
		}
		if(checker.equals("<=")) {
			return sum <= num;
		}
		if(checker.equals(">=")) {
			return sum >= num;
		}
		return sum == num;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char c = 0;
		int answer = -1;
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if(set.contains(s) || (i > 0 && s.charAt(0) != c)) {
				answer = i % 2;
				break;
			}
			
			set.add(s);
			c = s.charAt(s.length() - 1);
		}
		System.out.print(answer == -1 ? "Fair Game" : "Player " + (answer + 1) + " lost");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		
		System.out.print(solve(s));
	}
	
	public static int solve(String[] s) {
		int answer = 0;
		HashSet<String> set = new HashSet<>();
		for(int i = s[0].length() - 1; i >= 0; i--) {
			for(int j = 0; j < s.length; j++) {
				String str = s[j].substring(i);
				
				if(set.contains(str)) {
					answer++;
					set.clear();
					break;
				}
				else {
					set.add(str);
				}
			}
			if(set.size() != 0) {
				return answer + 1;
			}
			set.clear();
		}
		return s[0].length();
	}
}

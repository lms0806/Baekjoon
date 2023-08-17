import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		String[] s = new String[n];
		
		int idx = 0;
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
			
			if(!s[i].equals("?")) {
				set.add(s[i]);
			}
			else {
				idx = i;
			}
		}
		
		String a = idx > 0 ? s[idx - 1] : null, b = idx < n - 1 ? s[idx + 1] : null;
		
		int m = Integer.parseInt(br.readLine());
		
		String answer = null;
		while(m --> 0) {
			String str = br.readLine();
			
			if(set.contains(str)) {
				continue;
			}
			
			if(a == null) {
				if(b == null) {
					answer = str;
					break;
				}
				if(str.charAt(str.length() - 1) == b.charAt(0)) {
					answer = str;
					break;
				}
			}
			else {
				if(b == null) {
					if(str.charAt(0) == a.charAt(a.length() - 1)) {
						answer = str;
						break;
					}
				}
				if(str.charAt(0) == a.charAt(a.length() - 1) && str.charAt(str.length() - 1) == b.charAt(0)) {
					answer = str;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}

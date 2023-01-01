import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			String[] s = new String[n];
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				s[i] = br.readLine();
				min = Math.min(min, s[i].length());
			}
			
			int num = -1;
			for(int i = 0; i < min; i++) {
				HashSet<String> set = new HashSet<>();
				for(int j = 0; j < s.length; j++) {
					set.add(s[j].substring(i));
				}
				
				if(set.size() == s.length) {
					num++;
				}
			}
			sb.append(num).append("\n");
		}
		System.out.print(sb);
	}
}

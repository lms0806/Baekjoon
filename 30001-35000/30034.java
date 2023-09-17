import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine());
		
		HashSet<Character> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			set.add(st.nextToken().charAt(0));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			set.add(st.nextToken().charAt(0));
		}
		
		int k = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(k --> 0) {
			char ch = st.nextToken().charAt(0);
			
			if(set.contains(ch)) {
				set.remove(ch);
			}
		}
        
        br.readLine();
		
        boolean flag = false;
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(set.contains(c) || c == ' ') {
				if(flag) {
					sb.append("\n");
					flag = false;
				}
				continue;
			}
			sb.append(c);
			flag = true;
		}
		System.out.print(sb);
	}
}

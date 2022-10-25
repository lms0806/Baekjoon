import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		while(n --> 0) {
			set.add(br.readLine());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			boolean flag = true;
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				String s = br.readLine();
				
				if(s.equals("-1")) {
					break;
				}
				
				if(!set.contains(s)) {
					flag = false;
					sb.append(s).append("\n");
				}
			}
			
			answer.append("Email ").append(i);
			answer.append(" is " + (flag ? "" : "not ") + "spelled correctly.").append("\n");
			answer.append(sb);
		}
		System.out.print(answer + "End of Output");
	}
}

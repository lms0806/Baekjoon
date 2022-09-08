import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			HashSet<String> set = new HashSet<>();
			while(n --> 0) {
				set.add(br.readLine());
			}
			
			sb.append("Week ").append(idx).append(" ").append(set.size()).append("\n");
			idx++;
		}
		System.out.print(sb);
	}
}

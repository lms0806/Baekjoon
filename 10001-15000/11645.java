import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			HashSet<String> set = new HashSet<>();
			while(n --> 0) {
				set.add(br.readLine());
			}
			
			sb.append(set.size()).append("\n");
		}
		System.out.print(sb);
	}
}

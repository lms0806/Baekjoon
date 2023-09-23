import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			if(n == 0 && k == 0) {
				break;
			}
			
			ArrayList<Integer> broke = new ArrayList<>(), safe = new ArrayList<>();
			broke.add(k);
			safe.add(1);
			
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				String s = st.nextToken();
				
				if(s.equals("SAFE")) {
					safe.add(num);
				}
				else {
					broke.add(num);
				}
			} 
			
			Collections.sort(safe);
			Collections.sort(broke);
			
			sb.append(safe.get(safe.size() - 1) + 1).append(" ").append(broke.get(0) - 1).append("\n");
		}
		System.out.print(sb);
	}
}

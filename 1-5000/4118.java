import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while(n != 0) {
			HashSet<Integer> set = new HashSet<>();
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) {
					set.add(Integer.parseInt(st.nextToken()));
				}
			}
			
			sb.append(set.size() == 49 ? "Yes" : "No").append("\n");
			n = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}

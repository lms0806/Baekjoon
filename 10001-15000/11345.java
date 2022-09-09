import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			br.readLine();
			
			HashSet<Integer> set = new HashSet<>(), set1 = new HashSet<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				set.add(Integer.parseInt(st.nextToken()));
			}
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				set1.add(Integer.parseInt(st.nextToken()));
			}
			
			sb.append(set.size() == set1.size() ? "what a lovely party" : "you've messed up, Cornell").append("\n");
		}
		System.out.print(sb);
	}
}

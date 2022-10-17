import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		while(m --> 0) {
			String s = br.readLine();
			
			if(set.contains(s)) {
				set.remove(s);
			}
			set.add(s);
		}
		
		Iterator<String> iter = set.iterator();
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext() && n != 0) {
			sb.append(iter.next()).append("\n");
			n--;
		}
		System.out.print(sb);
	}
}

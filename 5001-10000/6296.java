import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i <= s.length() - n; i++) {
			set.add(s.substring(i, i + n));
		}
		System.out.print(set.size());
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			set.add(st.nextToken());
		}
		
		System.out.print(15000 - set.size());
	}
}

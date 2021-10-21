import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	static int n, k;
	static String[] s;
	static boolean[] visited;
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		
		s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		
		visited = new boolean[n];
		
		card(k, "");
		
		System.out.print(set.size());
	}
	
	public static void card(int remain, String k) {
		if(remain == 0) {
			set.add(k);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				card(remain - 1, k + s[i]);
				visited[i] = false;
			}
		}
	}
}

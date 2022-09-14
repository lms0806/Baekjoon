import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		ArrayList<String>[] arr = new ArrayList[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = new ArrayList<>();
		}
		int[] idx = new int[26];
		
		while(n --> 0) {
			String s = br.readLine();
			
			arr[s.charAt(0) - 'a'].add(s);
		}
		
		for(int i = 0; i < 26; i++) {
			Collections.sort(arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			int a = br.readLine().charAt(0) - 'a';
			
			sb.append(arr[a].get(idx[a]++ % arr[a].size())).append("\n");
		}
		System.out.print(sb);
	}
}

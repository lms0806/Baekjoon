import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken()) - 1;
		
		dfs(new StringBuilder(), 0);
		
		Collections.sort(arr);
		
		System.out.print(arr.size() <= k ? -1 : arr.get(k));
	}
	
	public static void dfs(StringBuilder sb, int sum) {
		if(sum == n) {
			arr.add(sb.toString().substring(0, sb.length() - 1));
			return;
		}
		
		for(int i = 1; i < 4; i++) {
			if(sum + i <= n) {
				sb.append(i).append("+");
				dfs(sb, sum + i);
				sb.setLength(sb.length() - 2);
			}
		}
	}
}

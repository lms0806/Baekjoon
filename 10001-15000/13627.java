import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		boolean[] check = new boolean[n + 1];
		
		st = new StringTokenizer(br.readLine());
		while(r --> 0) {
			check[Integer.parseInt(st.nextToken())] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb.toString().equals("") ? "*" : sb);
	}
}
